<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script src="../js/insertProduct.js" type="text/javascript"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</head>
<body data-aos-easing="slide" data-aos-duration="800" data-aos-delay="0">
	<section class="ftco-section contact-section ftco-degree-bg">
		<div class="container">
			<div class="row block-9">
				<div class="col-md-6 pr-md-5">
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
	</section>
</body>
</html>