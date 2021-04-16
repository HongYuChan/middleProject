<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보 수정</h1>
	<div id="container">
		
			<table border="0" class="modify_table">
				<tbody>
					<tr>
						<th>아이디</th>
						<td>${member.user_id}</td>
					</tr>
					
					<tr>
						<th>비밀번호</th>
						<td>
						<form action="modifyprofile.do?user_id=${member.user_id}" method="post">
							현재 비밀번호 <input type="password" name="pre_password"><br>
							변경할 비밀번호 <input type="password" name="after_password"><br>
							비밀번호 확인 <input type="password" name="password_check"><br>
							<input type="submit" value="비밀번호 변경">		
								</form>	
						</td>
					</tr>
					<tr>
						<th>닉네임</th>
						<td><input type="text" name="nickname" value="${member.nickname}">
							<input type="submit" value="닉네임 변경"></td>
					</tr>
					<tr>
						<th>이메일</th>
						<td><input type="email" name="email" value="${member.email}">
							<input type="submit" value="이메일 변경"></td>
					</tr>
					<tr>
						<th>프로필 사진</th>
						<td><img src="${mimg.url}" class="profile_photo"></td>
					</tr>
				
				</tbody>
			</table>
		<a href="myprofile.do?user_id=${member.user_id}"><input type="button" value="돌아가기"></a>
		<a href="deletemember.do"><input type="button" value="회원탈퇴"></a>
	</div>
</body>
</html>