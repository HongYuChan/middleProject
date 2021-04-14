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
	<a href="noticeInsertFormAction.do">글쓰기</a>
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>글제목</td>
			<td>작성자</td>
			<td>작성일자</td>
		</tr>
		<c:forEach var="noticeBoard" items="${noticeListModel.list}">
		<tr>	
			<td>${noticeBoard.notice_id }</td>
			<td><a href="noticeDetailBoard.do?notice_id=${noticeBoard.notice_id }">${noticeBoard.notice_title }</a></td>
			<td>${noticeBoard.notice_writer }</td>
			<td>
				<fmt:parseDate var="dt" value="${noticeBoard.notice_date }" pattern="yyyy-MM-dd HH:mm:ss"/>
				<fmt:formatDate value="${dt }" pattern="yyyy/MM/dd"/>
			</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	
	<!-- 페이징 처리 -->
	<!-- 이전 영역 -->
	<c:if test="${noticeListModel.startPage > 5 }">
		<a href="noticeListAction.do?pageNum=${noticeListModel.startPage-1 }">[이전]</a>
	</c:if>
	
	<!-- 페이지 목록 -->
	<c:forEach var="pageNo" begin="${noticeListModel.startPage }" end="${noticeListModel.endPage}">
		<c:if test="${noticeListModel.requestPage==pageNo }"><b></c:if>
		<a href="noticeListAction.do?pageNum=${pageNo }">[${pageNo }]</a>
		<c:if test="${noticeListModel.requestPage==pageNo }"></b></c:if>
	</c:forEach>
	
	<!-- 이후 영역 -->
	<c:if test="${noticeListModel.endPage <noticeListModel.totalPageCount }">
		<a href="noticeListAction.do?pageNum=${noticeListModel.endPage+1 }">[이후]</a>
	</c:if>
	
	<form action="noticeListAction.do" method="post">
		<input type="checkbox" name="area" value="notice_title">제목
		<input type="checkbox" name="area" value="notice_writer">작성자
		<input type="text" name="searchKey" size="10">
		<input type="submit" value="검색">
	</form>	
	
</body>
</html>

















