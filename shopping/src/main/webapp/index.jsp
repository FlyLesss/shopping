<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<title>总界面</title>
<%-- <base href="<%=basePath%>"> --%>
<script type="text/javascript">  
    function del(id){  
        $.get("<%=basePath%>goods/delgoods.htm?gid=" + id, function(data) {
			if ("success" == data.result) {
				alert("删除成功");
				window.location.reload();
			} else {
				alert("删除失败");
			}
		});
	}
</script>
</head>
<body>
	<h2>购物总界面</h2>
	<div>
		<c:if test="${not empty user}">
			<div>
				<font>${user.uname}</font>用户&nbsp;|&nbsp;<a
					href="/shopping/user/exit.htm"><font color=#499afd>退出</font></a>
			</div>
		</c:if>
		<c:if test="${empty user}">

			<input type="button" value="登      陆"
				onclick="window.location.href('/shopping/login.jsp')">
		</c:if>
	</div>
	<c:if test="${empty goods}">
		<div>空</div>
	</c:if>
	<table border="1">

		<tr>
			<th>图片：</th>
			<th>商品编号：</th>
			<th>商品名称：</th>
			<th>发布时间：</th>
			<th>价格：</th>
			<th>分类：</th>
			<th>详情：</th>
			<th>发布者：</th>
			<th>状态：</th>
			<th>操作：</th>

		</tr>
		<c:forEach var="temp" items="${goods}">
			<tr>
				<td><img src="${temp.gphoto}"></td>
				<td>${temp.gid}</td>
				<td>${temp.gname}</td>
				<td>${temp.releasetime}</td>
				<td>${temp.price}</td>
				<td>${temp.type}</td>
				<td>${temp.des}</td>
				<td>${temp.uid}</td>
				<td>${temp.state}</td>
				<td>
				<a href="javascript:del('${temp.gid}')">删除</a>
				<a href="<%=basePath%>goods/getonegood.htm?gid=${temp.gid}">更新</a>
			</tr>
		</c:forEach>


		<tr>
			<td colspan="10" align="center"><font size="2">共
					${page.totalPageCount} 页</font> <font size="2">第 ${page.pageNow} 页</font>
				<a href="/shopping/goods/allgoods.htm?pageNow=1">首页</a> <a
				href="/shopping/goods/allgoods.htm?pageNow=${page.pageNow >1?page.pageNow- 1 :1}">上一页</a>
				<a
				href="/shopping/goods/allgoods.htm?pageNow=${page.pageNow<page.totalPageCount?page.pageNow+1:page.totalPageCount}">下一页</a>
				<a
				href="/shopping/goods/allgoods.htm?pageNow=${page.totalPageCount}">尾页</a>
			</td>
		</tr>



	</table>
</body>
</html>