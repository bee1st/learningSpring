<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Learning Study</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Spring MVC01</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Board</div>
			<div class="panel-body">
				<table class="table table-bordered table-hover">
					<tr>
						<td>번호</td>					
						<td>제목</td>					
						<td>내용</td>					
						<td>작성자</td>					
						<td>작성일</td>					
						<td>조회수</td>
					</tr>
					<c:forEach var="boardVO" items="${list}">
						<tr>
							<td><c:out value="${boardVO.idx }" /></td>
							<td><a href="/boardContents.do?idx=${boardVO.idx }"><c:out value="${boardVO.title }" /></td>
							<td><c:out value="${boardVO.contents }" /></td>
							<td><c:out value="${boardVO.writer }" /></td>
							<td>${fn:split(boardVO.writeDate, " ")[0]}</td>
							<td><c:out value="${boardVO.count }" /></td>
						</tr>
					</c:forEach>
				</table>
				<a href='<c:out value="/boardForm.do" />' class="btn btn-primary btn-sm">글쓰기</a>
			</div>
			<div class="panel-footer">footer</div>
		</div>
	</div>
</body>
</html>
