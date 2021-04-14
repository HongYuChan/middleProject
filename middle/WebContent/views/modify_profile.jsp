<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보 수정</h1>
	<div id="container">
		<form action="modifyprofile.do" method="post">
		<input type="hidden" name="user_id" value="${member.user_id}">
		현재 비밀번호 <input type="password" name="pre_password"><br>
		변경할 비밀번호 <input type="password" name="after_password"><br>
		비밀번호 확인 <input type="password" name="password_check"><br>
		<input type="submit" value="바꾸기"><br>
		닉네임:${member.nickname}<br>
		이메일:${member.email}<br>
		프로필 사진:<br>
		</form>
		
		<a href="myprofile.do?user_id=${member.user_id}"><input type="button" value="돌아가기"></a>
		<a href="deletemember.do"><input type="button" value="회원탈퇴"></a>
	</div>
</body>
</html>