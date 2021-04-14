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
		<!-- 로고 누르면 메인페이지로 -->
		<a href=""><img alt="" src="" id="logo"></a>
		대충 메인 화면으로 가는 링크들
		
		<!-- 알람 아이콘 -->
		<img alt="" src="">
		<!-- 내 평가 아이콘 -->
		<img alt="" src="">
		
	</header>
	<!-- 사이드바 -->	
	<ul>
		<li><a href="">내 프로필</a></li>
		<li><a href="tradehistory.do?user_id=${member.user_id}">거래내역</a></li>
		<li><a href="">찜 목록</a></li>
		<li id="upload_sidebar"><a href="">업로드</a></li>
		<!-- 여기에 선긋기 -->
		<li>보유중인 코인</li>
		<li>${member.holding_coin} 코인</li><br>
		<a href=""><input type="submit" value="코인충전"></a>
	</ul>
	
	<!-- 현재 페이지 제목 -->
	<h1>회원정보</h1>
	<!-- 회색 선 긋기 -->
	<img alt="" src=""id="proflie_photo">
	<ul>
		<a href="modifyform.do?user_id=${member.user_id}"><input type="submit" value="프로필 수정"></a>
		<li>${member.nickname} = 별명</li>
		<li>${member.email} = 이메일</li>
	</ul>
	
	<h2>마지막 거래내역</h2>
	<!-- 회색 선 긋기 -->
		<ul>
			<img alt="" src="" id="recent_trade">
			<li>${product.product_name}제품 이름</li>
			<li>${member.nickname}판매자</li>
		</ul>
		
	<h2>최근 업로드 영상</h2>
		<img alt="" src="" id="recent_upload">
		<ul>
			<li>${product.product_name}제품 이름</li>
		</ul>
	
	
</body>
</html>