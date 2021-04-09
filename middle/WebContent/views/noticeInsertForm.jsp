<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="noticeInsertAction.do" method="post">
	작성자 : <input type="text" name="notice_writer"><br>
	제목 : <input type="text" name="notice_title"><br>
	내용 <br>
	<textarea rows="6" cols="70" name="notice_contents"></textarea>
	<br>
	<input type="submit" value="등록">
</form>
</body>
</html>