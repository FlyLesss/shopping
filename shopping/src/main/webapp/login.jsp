<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<form action = "/shopping/user/userlogin.htm" method="post">  
      <table width="300" height = "180" border="5" bordercolor="#A0A0A0">   
        <tr>  
          <th>账  户：</th>  
          <td><input type="text" name="uname"  value = "请输入用户名" maxlength = "16" onfocus = "if(this.value == '请输入用户名') this.value =''"></td>  
        </tr>  
        <tr>  
          <th>密  码：</th>  
          <td><input type="password" name="upassword" maxlength = "20"></td>  
        </tr>  
        <tr>  
          <td colspan = "2" align = "center">  
            <input type="submit" name="submit" value="登       录"> 
            <input type="button"  value="注       册"
              onclick="window.location.href('/shopping/register.jsp')">  
            <input type="button" value="返       回"  
              onclick="window.location.href('/shopping/index.jsp')">  
          </td>  
        </tr>  
      </table>  
    </form>  
</body>
</html>