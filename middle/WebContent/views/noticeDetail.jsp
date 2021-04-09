<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>글세부보기</h3>
	<ul>
		<li>${noticeBoard.notice_id }</li>
		<li>${noticeBoard.notice_title }</li>
		<li>${noticeBoard.notice_writer }</li>
		<li>${noticeBoard.notice_contents }</li>
	</ul><br><br>
	<br>
	
	<br><br>
	<a href="updateForm.do?seq=${NotionBoard.notice_id }">글수정</a>
	<a href="delete.jsp?seq=${NotionBoard.notice_id }">글삭제</a>
	
</body>
</html>




















