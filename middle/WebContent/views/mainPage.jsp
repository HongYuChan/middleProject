<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" session="true"%>
<%
	String user = (String)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="../mainPageCss/owl.carousel.min.css">
<link rel="stylesheet" href="../mainPageCss/magnific-popup.css">
<link rel="stylesheet" href="../mainPageCss/font-awesome.min.css">
<link rel="stylesheet" href="../mainPageCss/themify-icons.css">
<link rel="stylesheet" href="../mainPageCss/nice-select.css">
<link rel="stylesheet" href="../mainPageCss/flaticon.css">
<link rel="stylesheet" href="../mainPageCss/gijgo.css">
<link rel="stylesheet" href="../mainPageCss/animate.css">
<link rel="stylesheet" href="../mainPageCss/slicknav.css">
<link rel="stylesheet" href="../mainPageCss/mainPage.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<script type="text/javascript" src="../js/mainPage.js"></script>
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
											<a class="active" href="#">
												menu1
											</a>
										</li>
										<li>
											<a class="active" href="#">
												menu2
											</a>
										</li>
										<li>
											<a class="active" href="#">
												menu3
											</a>
										</li>
										<li>
											<a class="active" href="#">
												menu4
											</a>
										</li>
									</ul>
								</nav>
							</div>
						</div>
						<div class="col-xl-3 col-lg-3 d-done d-lg-block">
							<div class="log_chat_area d-flex align-items-center">
								<a href="javascript:popupLogin()" class="login popup-with-form">
									<i class="flaticon-user"></i>
									<span>log in</span>
								</a>
								<div class="live_chat_btn">
									<a class="boxed_btn_green" href="#">
										<i class="flaticon-chat"></i>
										<span>Live chat</span>
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
	
	<div class="slider_area">
		<div class="single_slider d-flex align-items-center justify-content-center slider_bg_1 overlay2">
			<div class="container">
				<div class="row align-items-center justify-content-center">
					<div class="col-xl-9">
						<div class="slider_text text-center">
							<P>user : <%= user %></P>
							<p>Test Search Video</p>
							<h3>Main Search Page</h3>
							<div class="find_dowmain">
								<form action="#" class="find_dowmain_form">
									<input type="text" placeholder="Find Video">
									<button type="submit">Search</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>