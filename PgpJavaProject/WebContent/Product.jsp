<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>

<br />
<br />
<form action="ProductController" method="post">
<table align="right" cellspacing="2">
<tr bgcolor="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva" color="blue"  size="5">Product Info</font>
</h2>
</td>
</tr>

<tr bgcolor="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva"  color="red"  size="5">${errorInfo }</font>
</h2>
</td>
</tr>


<tr>
<td>Product Name</td>
<td><input type="text" name="productname" required/></td>
</tr>
<tr>
<td>Price</td>
<td><input type="text" name="price" required/></td>
</tr>
<tr>
<td>Description</td>
<td><textarea cols="30" rows="5" name="desc" required></textarea></td>
</tr>
<tr>
<td>Stock</td>
<td><input type="text" name="stock" required/></td>
</tr>
<tr>
<td>Category</td>
<td><select name="category" required>
<option value="Mobile">Mobile</option>
<option value="PenDrive">PenDrive</option>
<option value="HardDisk">HardDisk</option>
<option value="Earphone">Earphone</option>
</Select></td>
</tr>
<tr>
<td>Supplier</td>
<td><select name="supplier" required>
<option value="CloudTail">Cloud Tail</option>
<option value="Ekart">Ekart</option>
<option value="ETech">Etech</option>
<option value="BigSeller">BigSeller</option>
</Select></td>



</tr>
<tr bgcolor="gray">
<td colspan="2"><center>
<input type="submit" value="Insert"/>
</center></td>
</tr>
</table>
</form>
</body>
</html>



