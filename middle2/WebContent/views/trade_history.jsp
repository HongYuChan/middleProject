<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>거래내역</h1>
	<div class="container">
		<img alt="" src="">
		<ul>
			<li>제품 이름 : ${product.product_name}</li>
			<li>판매자 : ${}</li>
			<li>구매 가격 : ${product.sale_price}</li>
		</ul>
	</div>
</body>
</html>