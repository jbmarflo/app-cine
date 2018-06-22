<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenidos al cine</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<link rel="stylesheet" href="${ urlPublic }/bootstrap/css/bootstrap.min.css">
</head>
<body>

	<!-- 	<h1>Lista de peliculas</h1> -->
	<!-- 	<ol> -->
	<%-- 		<c:forEach items="${ movies }" var="movie"> --%>
	<%-- 			<li>${ movie }</li> --%>
	<%-- 		</c:forEach> --%>
	<!-- 	</ol> -->

	<div class="panel panel-default">
		<div class="panel-heading">Tabla de peliculas</div>
		<div class="panel-body">
			<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Titulo</th>
						<th>Duracion</th>
						<th>Clasificación</th>
						<th>Genero</th>
						<th>Imagen</th>
						<th>Fecha de estreno</th>
						<th>Estado</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ movies }" var="movie">
						<tr>
							<td>${ movie.id }</td>
							<td>${ movie.title }</td>
							<td>${ movie.duration }min.</td>
							<td>${ movie.classification }</td>
							<td>${ movie.type }</td>
							<td><img src="${ urlPublic }/images/${ movie.image }" width="80" height="100" /></td>
							<td><fmt:formatDate value="${ movie.releaseDate }" pattern="dd-MM-YYY" /></td>
							<td>
								<c:choose>
									<c:when test="${ movie.state == '0' }">
										<span class="label label-success">${ movie.stateWord() }</span>
										
									</c:when>
									<c:otherwise>
										<span class="label label-danger">${ movie.stateWord() }</span>
									</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>