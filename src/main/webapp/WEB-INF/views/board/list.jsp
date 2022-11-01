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

	<div class="container-fluid">
	<div class="row justify-content-center">
	<div class="col-8">
	<h1>List Page</h1>
	
	<div>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>NUM</th>
					<th>TILTE</th>
					<th>WRITER</th>
					<th>HIT</th>
					<th>DATE</th>
				</tr>
			</thead>
			
			<tbody>
			<c:forEach items="${list}" var="vo">
				<tr>
					<td>${vo.num}</td>
					<td>${vo.title}</td>
					<td>${vo.writer}</td>
					<td>${vo.hit}</td>
					<td>${vo.regDate}</td>
				</tr>	
			</c:forEach>
			
			</tbody>
			
			
		</table>
	
	</div>
	
	</div>
	</div>
	</div>
	
	
</body>
</html>