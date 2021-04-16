<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" session="true"%>
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
<link rel="stylesheet" href="../mainPageCss/detail.css">

<!-- 아이콘 사용 CND -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script src="https://kit.fontawesome.com/f73ccf4d61.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<script type="text/javascript" src="../js/insertProduct.js"></script>
<SCRIPT src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></SCRIPT>

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
												Chatting
											</a>
										</li>
										<li>
											<a class="active" href="#">
												Product
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
	
	<div class="slider_area">
		<div class="single_slider d-flex align-items-center justify-content-center slider_bg_1 overlay2">
			<div class="container">
			<div class="row align-items-center justify-content-center">
				<div class="col-md-6 pr-md-5">
				<div class="slider_text text-center">
					<form action="insertProductAction.do" method="post" enctype="multipart/form-data">  <!-- 파일 전송을 위해 enctype 설정 -->
						<div class="form-group">
							<input type="text" placeholder="Title" class="form-control" name="title">
						</div>
						<div class="form-group">
							<input type="text" placeholder="Product Name" class="form-control" name="product_name">
						</div>
						<div class="form-group">
							<input type="text" placeholder="Min Price" class="form-control" name="min_price">
						</div>
						<div class="form-group">
							<select class="form-control" name="pay_method">
								<option value="coin">coin</option>
								<option value="cash">cash</option>
							</select>
						</div>
						
						<div class="form-group">
							<input type="text" id="endDate" placeholder="End Date" class="form-control" name="sale_date">
						</div>
						<div class="form-group">
							<textarea rows="30" cols="6" class="form-control" placeholder="Product Info" 
							style="margin-top: 0px; margin-bottom: 0px; height: 150px;" name="product_info"></textarea>
						</div>
						<div class="form-group">
							<input type="file" name="video_url">
						</div>
						<div class="form-group">
							<input type="submit" value="Post" class="btn btn-primary py-3 px-5">
						</div>
					</form>
					</div>
				</div>
			</div>
		</div>
		</div>
	</div>
</body>
</html>