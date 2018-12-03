<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
function check(){
	if(document.order.quantity.value<=0){
		alert{"quntity must be greater than zero !!"};return false;
	}
	else if(document.order.quantity.value==""){
		alert{"Please fill quantity"};return false;
	}
		
	else
		return true;

}
</script>
</head>
<body>
<h3 ><center>Welcome to SharePrice</center></h3>
<c:form name="order"  action="summary?name=${data.stock}" modelAttribute="my"  method="POST" >
<table border="1" align="center">


<tr>
<td>Stock</td>
<td>${data.stock}</td>
</tr>

<tr>
<td>Quote</td>
<td>Rs. ${data.quote} </td>

</tr>

<tr>
<td>Select Action</td>
<td><input type="radio" id="action" value="act1" name="act" checked/>Buy  <input type="radio" id="action"  value="act" name="act"/>Sell </td>
</tr>

<tr>
<td>Quantity</td>
<td><input type="text"  id="quantity" name="qua" pattern="[1-9][0-9]*" title="Please enter greter than zero"/> </td>

</tr>

<tr> <td><input type="submit" value="Order"  /></td></tr>


</table>
</c:form>
</body>
</html>