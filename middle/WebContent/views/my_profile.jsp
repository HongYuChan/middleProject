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
		<li><a href="tradehistory.do?user_id=${member_p.user_id}">거래내역</a></li>
		<li><a href="">찜 목록</a></li>
		<li id="upload_sidebar"><a href="">업로드</a></li>
		<!-- 여기에 선긋기 -->
		<li>보유중인 코인</li>
		<li>${member_p.holding_coin} 코인</li><br>
		<a href=""><input type="submit" value="코인충전"></a>
	</ul>
	
	<!-- 현재 페이지 제목 -->
	<h1>회원정보</h1>
	<!-- 회색 선 긋기 -->
	<table border="0">
		<tbody>
			<th><img src="${mimg.url}" class="profile_photo"><br>
				<a href="modifyform.do?user_id=${member._puser_id}"><input type="submit" value="프로필 수정"></a></th>
			<td>${member_p.nickname}<br>
				${member_p.email} </td>
			
		</tbody>
	</table>
	<table>
		<tbody>
			<h2>마지막 거래내역</h2>
			<!-- 회색 선 긋기 -->
			<th><img src="${member_p.image_url}" id="recent_trade"></th>
			<td>${member_p.product_name}</td>
			
		</tbody>
	</table>
	<tbody>
		<h2>최근 업로드 영상</h2>
		<!-- 회색 선 긋기 -->
		<th><img alt="" src="" id="recent_upload"></th>
		<td>${member_p.product_name}</td>
	</tbody>
	</table>
</body>
</html>