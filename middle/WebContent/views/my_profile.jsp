<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<header>
		<!-- �ΰ� ������ ������������ -->
		<a href=""><img alt="" src="" id="logo"></a>
		���� ���� ȭ������ ���� ��ũ��
		
		<!-- �˶� ������ -->
		<img alt="" src="">
		<!-- �� �� ������ -->
		<img alt="" src="">
		
	</header>
	<!-- ���̵�� -->	
	<ul>
		<li><a href="">�� ������</a></li>
		<li><a href="tradehistory.do?user_id=${member.user_id}">�ŷ�����</a></li>
		<li><a href="">�� ���</a></li>
		<li id="upload_sidebar"><a href="">���ε�</a></li>
		<!-- ���⿡ ���߱� -->
		<li>�������� ����</li>
		<li>${member.holding_coin} ����</li><br>
		<a href=""><input type="submit" value="��������"></a>
	</ul>
	
	<!-- ���� ������ ���� -->
	<h1>ȸ������</h1>
	<!-- ȸ�� �� �߱� -->
	<table border="0">
		<tbody>
			<th><img src="${mimg.url}" class="profile_photo"><br>
				<a href="modifyform.do?user_id=${member.user_id}"><input type="submit" value="������ ����"></a></th>
			<td>${member.nickname}<br>
				${member.email} </td>
			
		</tbody>
	</table>
	<table>
		<tbody>
			<h2>������ �ŷ�����</h2>
			<!-- ȸ�� �� �߱� -->
			<th><img src="${pimg.image_url}" id="recent_trade"></th>
			<td>${product.product_name}</td>
			
		</tbody>
	</table>
	<tbody>
		<h2>�ֱ� ���ε� ����</h2>
		<!-- ȸ�� �� �߱� -->
		<th><img alt="" src="" id="recent_upload"></th>
		<td>${product.product_name}</td>
	</tbody>
	</table>
</body>
</html>