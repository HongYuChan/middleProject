<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	<img alt="" src=""id="proflie_photo">
	<ul>
		<a href="modifyform.do?user_id=${member.user_id}"><input type="submit" value="������ ����"></a>
		<li>${member.nickname} = ����</li>
		<li>${member.email} = �̸���</li>
	</ul>
	
	<h2>������ �ŷ�����</h2>
	<!-- ȸ�� �� �߱� -->
		<ul>
			<img alt="" src="" id="recent_trade">
			<li>${product.product_name}��ǰ �̸�</li>
			<li>${member.nickname}�Ǹ���</li>
		</ul>
		
	<h2>�ֱ� ���ε� ����</h2>
		<img alt="" src="" id="recent_upload">
		<ul>
			<li>${product.product_name}��ǰ �̸�</li>
		</ul>
	
	
</body>
</html>