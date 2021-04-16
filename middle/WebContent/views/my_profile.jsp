<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="../myPageCss/owl.carousel.min.css">
<link rel="stylesheet" href="../myPageCss/magnific-popup.css">
<link rel="stylesheet" href="../myPageCss/font-awesome.min.css">
<link rel="stylesheet" href="../myPageCss/themify-icons.css">
<link rel="stylesheet" href="../myPageCss/nice-select.css">
<link rel="stylesheet" href="../myPageCss/flaticon.css">
<link rel="stylesheet" href="../myPageCss/gijgo.css">
<link rel="stylesheet" href="../myPageCss/animate.css">
<link rel="stylesheet" href="../myPageCss/slicknav.css">
<link rel="stylesheet" href="../myPageCss/mainPage.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://kit.fontawesome.com/f73ccf4d61.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<link rel="stylesheet" href="../myPageCss/sidebar.css">
</head>
<body>
	<header>
		<div class="header-area">
			<div id="sticky-header" class="main-header-area">
				<div class="container-fluid p-0">
					<div class="row align-items-center no gutters">
						<div class="col-xl-2 col-lg-2">
							<div class="logo-img">
								<a href="#">
									<img src="" alt>
								</a>
							</div>
						</div>
						<div class="col-xl-7 col-lg-7">
							<div class="main-menu d-done d-lg-block">
								<nav>
									<ul id="navigation">
										<li>
											<a class="active" href="mainPage.do">
												Home
											</a>
										</li>
										<li>
											<a class="active" href="#">
												Notice
											</a>
										</li>
										<li>
											<a class="active" href="#">
												MyPage
											</a>
										</li>
										<li>
											<a class="active" href="#">
												menu4
											</a>
										</li>
										<li>
											<a class="active" href="#">
												menu5
											</a>
										</li>
									</ul>
								</nav>
							</div>
						</div>
						<div class="col-xl-3 col-lg-3 d-done d-lg-block">
							<div class="log_chat_area d-flex align-items-center">
								<a href="loginForm.do" class="login popup-with-form">
									<i class="fas fa-sign-in-alt"></i>
									<span>log in</span>
								</a>
								<div class="live_chat_btn">
									<a href="insertSignUpForm.do">
										<i class="fas fa-user-plus"></i>
										<span>Sign Up</span>
									</a>
								</div>
							</div>
						</div>
						<div class="col-12">
							<div class="mobile_menu d-block d-lg-none">
								<div class="slicknav_menu">
									<a href="#" aria-haspopup="true" role="button" tabindex="0" class="slicknav_btn slicknav_collapsed" style="outline: none;">
										<span class="slicknav_menutxt">Menu</span>
										<span class="slicknav_icon">
											<span class="slicknav_icon-bar"></span>
											<span class="slicknav_icon-bar"></span>
											<span class="slicknav_icon-bar"></span>
										</span>
									</a>
									<ul class="slicknav_nav slicknav_hidden" area-hidden="true" role="menu" style="display: none;">
										<li></li>
										<li></li>
										<li></li>
										<li></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- 사이드바 -->	
	
	<div class="slider_area">
		<div class="single_slider d-flex align-items-center justify-content-center slider_bg_1 overlay2">
		<div class = "sidebar">
		<ul>
			<li><a href="">내 프로필</a></li>
			<li><a href="tradehistory.do?user_id=${member_p.user_id}">거래내역</a></li>
			<li><a href="">찜 목록</a></li>
			<li id="upload_sidebar"><a href="">업로드</a></li>
			<!-- 여기에 선긋기 -->
			<li>보유중인 코인</li>
			<li>${member.holding_coin} 코인</li><br>
			<a href=""><input type="submit" value="코인충전"></a>
		</ul>
	</div>
			<div class="container">
				<div class="row align-items-center justify-content-center">
			
					<div class="col-md-10 pr-md-5">
						<!-- insertSignUpAction.do -->
						<div class="slider_text text-center">
							
							<table class="table_board">
								<tbody>
									<h1>회원정보</h1>
									<th><img src="${mimg.url}" class="profile_photo"><br>
									<a href="modifyform.do?user_id=${member.user_id}"><input type="submit" value="프로필 수정"></a></th>
									<td>${member.nickname}<br>
										${member.email} </td>
								</tbody>
							</table>
							<table class="table_board">
								<tbody>
									<h2>마지막 거래내역</h2>
									<!-- 회색 선 긋기 -->
									<th><img src="${product.image_url}" id="recent_trade"></th>
									<td>${product.product_name}</td>
								</tbody>
							</table>
							<table>
								<tbody>
									<h2>최근 업로드 영상</h2>
									<!-- 회색 선 긋기 -->
									<th><img alt="" src="" id="recent_upload"></th>
									<td>${product.product_name}</td>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	<!-- 현재 페이지 제목 -->
	
	<!-- 회색 선 긋기 -->
	<div class="container">
		
		
	</div>
</body>
</html>