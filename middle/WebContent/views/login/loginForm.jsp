<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 페이지</title>
<link rel="stylesheet" href="/views/login/login.css">
<script src=></script>
</head>
<body>
	<section class="login-form"> 
		<h1>Logo Design</h1>
		<form action="checkUser.do" method="post">
			<div class="int-area">
				<input type="text" name="id" id="id"
				autocomplete="off" required>
				<label for="id">USER NAME</label>
			</div>
			<div class="int-area">
				<input type="password" name="password" id="password"
				autocomplete="off" required>
				<label for="password">PASSWORD</label>
			</div>
			<div class="btn-area">
				<button type="submit">LOGIN</button>
			</div>
		</form>
		<div class="caption">
			<a href="">Forgot Password?</a>
		</div>
	</section>

</body>
</html>