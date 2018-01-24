<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script language="javascript">
	function isValid(form) {
		if (form.uname.value == "") {
			alert("用户名不能为空");
			return false;
		}
		if (form.upassword.value != form.upassword2.value) {
			alert("两次输入的密码不同！");
			return false;
		} else if (form.upassword.value == "") {
			alert("用户密码不能为空！");
			return false;
		} else
			return true;
	}
</script>
</head>
<body>
	<center>
		<h2>用户注册</h2>
		<form action="user/register.htm" method="post"
			enctype="multipart/form-data">
			<div>
				<img  id="image"src="photo/default.png" height="100px" width="100px">
				<input type ="file" name="file"  onchange="document.all['image'].src=unescape(this.value);">
			</div>
			<table>
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="uname" size="20" /></td>
				</tr>
				<tr>
					<td>输入密码:</td>
					<td><input type="text" name="upassword" size="20" /></td>
				</tr>
				<tr>
					<td>再次确认密码:</td>
					<td><input type="text" name="upassword2" size="20" /></td>
				<tr>
				<tr>
					<td>联系电话:</td>
					<td><input type="text" name="phone" size="22" /></td>
				</tr>
				<tr>
					<td>邮箱:</td>
					<td><input type="text" name="email" size="25" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="注册" />
					<td><input type="reset" value="重置" />
			</table>
		</form>
	</center>
	<br>
</body>
</html>