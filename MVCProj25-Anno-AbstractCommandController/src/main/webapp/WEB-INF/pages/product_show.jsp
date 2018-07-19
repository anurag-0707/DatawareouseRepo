<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>manufacture Date</th>
			<th>Expiry Date</th>
		</tr>
		<c:forEach var="prod" items="${products}">
			<tr>
				<td>${prod.productId }</td>
				<td>${prod.productName }</td>
				<td>${prod.productPrice }</td>
				<td>${prod.productQuantity }</td>
				<td>${prod.productManufacturedDate }</td>
				<td>${prod.productExpiryDate }</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>