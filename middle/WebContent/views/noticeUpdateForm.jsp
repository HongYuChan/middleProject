<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 글번호를 받아서 DB로부터 글 1개를 받아야함 -->
<!-- 해당 글을 폼에 출력(title, contents) -->
	<form action="noticeUpdateAction.do" method="post">
		<input type="hidden" name="notice_id" value="${noticeBoard.notice_id }">
		작성자 : <input type="text" name="notice_writer" value="${noticeBoard.notice_writer }"><br>
		제목 : <input type="text" name="notice_title" value="${noticeBoard.notice_title }"><br>
		내용 <br>
		<textarea rows="6" cols="70" name="notice_contents">${noticeBoard.notice_contents }</textarea>
		<br>
	<input type="submit" value="수정완료">
	</form>
</body>
</html>








