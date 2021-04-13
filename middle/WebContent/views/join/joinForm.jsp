<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입 화면</title>
</head>
<body>
	<form method="POST" action="insertMemberInfo.do">
			<!-- 아이디 -->
			<div class="form-group">
				<label for="id">아이디</label>
					<input type="text" class="form-control" id="id" name="id" placeholder="ID" required>
				<div class="check_font" id="id_check"></div>
			</div>
			<!-- 비밀번호 -->
			<div class="form-group">
				<label for="password">비밀번호</label>
					<input type="password" class="form-control" id="password" name="password" placeholder="PASSWORD" required>
				<div class="check_font" id="pw_check"></div>
			</div>
			<!-- 비밀번호 재확인 -->
			<div class="form-group">
				<label for="pw2">비밀번호 확인</label>
					<input type="password" class="form-control" id="pw2" name="pw2" placeholder="Confirm Password" required>
				<div class="check_font" id="pw2_check"></div>
			</div>
			<!--닉네임 -->
			<div class="form-group">
				<label for="nickname">닉네임</label>
					<input type="text" class="form-control" id="nickname" name="nickname" placeholder="Nickname" required>
				<div class="check_font" id="name_check"></div>
			</div>
			<!-- 본인확인 이메일 -->
			<div class="form-group">
				<label for="email">이메일</label>
					<input type="text" class="form-control" name="email" id="email" placeholder="E-mail" required>
					<!-- <input type="text" style="margin-top: 5px;"class="email_form" name="email_confirm" id="email_confirm" placeholder="인증번호를 입력해주세요!" required>
						<button type="button" class="btn btn-outline-danger btn-sm px-3" onclick="confirm_email()">
							<i class="fa fa-envelope"></i>&nbsp;인증
						</button>&nbsp;
						<button type="button" class="btn btn-outline-info btn-sm px-3">
							<i class="fa fa-envelope"></i>&nbsp;확인
						</button>&nbsp; -->
					<div class="check_font" id="email_check"></div>
			</div>
			<!-- 휴대전화 -->
			<div class="form-group">
				<label for="phone_number">휴대전화 ('-' 없이 번호만 입력해주세요)</label>
				<input type="text" class="form-control" id="phone_number" name="phone_number" placeholder="Phone Number" required>
				<div class="check_font" id="phone_check"></div>
			</div>
			<div class="reg_button">
				<a class="btn btn-danger px-3" href="">
					<i class="fa fa-rotate-right pr-2" aria-hidden="true"></i>취소하기
				</a>&emsp;&emsp;
				<button class="btn btn-primary px-3" id="reg_submit">
					<i class="fa fa-heart pr-2" aria-hidden="true"></i>가입하기
				</button>
			</div>
		</form>

</body>
</html>