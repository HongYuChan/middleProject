<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="noticeInsertForm.do">글쓰기</a>
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>글제목</td>
			<td>작성자</td>
			<td>작성일자</td>
			<td>조회수</td>
		</tr>
		<c:forEach var="noticeBoard" items="${NoticeList}">
		<tr>	
			<td>${noticeBoard.notice_id }</td>
			<td><a href="noticeDetailBoard.do?notice_id=${noticeBoard.notice_id }">${noticeBoard.notice_title }</a></td>
			<td>${noticeBoard.notice_writer }</td>
			<td>
				<fmt:parseDate var="dt" value="${noticeBoard.notice_date }" pattern="yyyy-MM-dd HH:mm:ss"/>
				<fmt:formatDate value="${dt }" pattern="yyyy/MM/dd"/>
			</td>
			<td>${noticeBoard.notice_hitcount }</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	
	<form action="NoticeListAction.do" method="post">
		<input type="checkbox" name="area" value="notice_title">제목
		<input type="checkbox" name="area" value="notice_writer">작성자
		<input type="text" name="searchKey" size="10">
		<input type="submit" value="검색">
	</form>	
	
</body>
</html>

















