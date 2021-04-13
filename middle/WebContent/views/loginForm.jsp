<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- 부트 스트랩 css -->
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Alex+Brush" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="../insertProductCss/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="../insertProductCss/animate.css">
<link rel="stylesheet" href="../insertProductCss/owl.carousel.min.css">
<link rel="stylesheet" href="../insertProductCss/owl.theme.default.min.css">
<link rel="stylesheet" href="../insertProductCss/magnific-popup.css">
<link rel="stylesheet" href="../insertProductCss/aos.css">
<link rel="stylesheet" href="../insertProductCss/ionicons.min.css">
<link rel="stylesheet" href="../insertProductCss/bootstrap-datepicker.css">
<link rel="stylesheet" href="../insertProductCss/jquery.timepicker.css">
<link rel="stylesheet" href="../insertProductCss/flaticon.css">
<link rel="stylesheet" href="../insertProductCss/icomoon.css">
<link rel="stylesheet" href="../insertProductCss/style.css">
<!-- 폰트 및 부트스트랩 -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script src="../js/insertProduct.js" type="text/javascript"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<script type="text/javascript" src="../js/logIn.js" charset="utf-8"></script>

</head>
<body data-aos-easing="slide" data-aos-duration="800" data-aos-delay="0">
	<section class="ftco-section contact-section ftco-degree-bg">
		<div class="container">
			<div class="row block-9">
				<div class="col-md-6 pr-md-5">
				<!-- insertSignUpAction.do -->
					<form action="insertSignUpAction.do" id="signForm" method="post">
						<div class="form-group">
							<input type="text" placeholder="ID" class="form-control" name="id">
						</div>
						<div class="form-group">
							<input type="password" placeholder="PassWord" class="form-control" name="password">
						</div>
						<div class="form-group">
							<input type="submit" value="Post" class="btn btn-primary py-3 px-5">
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>