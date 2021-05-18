<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<br/>
<form action="RegisterController" method="post">
<table align="right" cellspacing="2">
<tr bgcolor="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva" color="blue"  size="10">Sign Up</font>
</h2>
</td>
</tr>

<tr bgcolor="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva"  color="red"  size="10">${errorInfo }</font>
</h2>
</td>
</tr>


<tr>
<td>Login</td>
<td><input type="text" name="loginId" required/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="passwd" required/></td>
</tr>
<tr>
<td>Customer Name</td>
<td><input type="text" name="customerName" required/></td>
</tr>
<tr>
<td>EmailId</td>
<td><input type="email" name="emailId" placeholder="example@example.com" required/></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="mobileNo" pattern="[789]\d{9}"
placeholder="Enter Mobile No of 10 digits" required/></td>
</tr>
<tr>
<td>Address</td>
<td><textarea cols="30" rows="5" name="addr"></textarea></td>
</tr>
<tr>
<td>Country</td>
<td><select name="country">
<option value="India">India</option>
<option value="United States">United States</option>
<option value="Canada">Canada</option>
<option value="Australia">Australia</option>
</Select></td>
</tr>
<tr bgcolor="gray">
<td colspan="2"><center>
<input type="submit" value="Sign Up"/>
</center></td>
</tr>
</table>
</form>
</body>
</html>

