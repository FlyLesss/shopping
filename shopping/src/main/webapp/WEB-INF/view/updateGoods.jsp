<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/shopping/goods/updategood.htm" method="post">

		<input type="hidden" name="gid" value="${good.gid }" /><br> 
		图片：<input type="text" name="gphoto" value="${good.gphoto}" /> <br>
		商品名称:<input type="text" name="gname" value="${good.gname}" /><br>
	             发布时间：<input type="text" name="releasetime" value="${good.releasetime}" /> <br>
		价格：<input type="text" name="price" value="${good.price}" /><br>
	             分类：<input type="text" name="type" value="${good.type}" /> <br>
	             详情：<input type="text"name="des" value="${good.des}"/> <br>
	             发布者：<input type="text" name="uid" value="${good.uid}" /><br>
	              状态：<input type="text" name="state" value="${good.state}" /> <br>
        <input type="submit" value="submit" value="提交" />
	</form>

</body>
</html>