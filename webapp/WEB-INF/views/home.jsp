<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenidos al cine</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

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
							<td>${ movie.image }</td>
							<td>${ movie.releaseDate }</td>
							<td>${ movie.state }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>