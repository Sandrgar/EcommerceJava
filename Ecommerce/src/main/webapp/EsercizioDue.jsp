<%@page import="model.bean.LibroBean"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2 class="text-center py-3">Esercizi</h2>
		<% List<LibroBean> lista = (List<LibroBean>) request.getAttribute("result"); %>
		
		<% for(LibroBean libro : lista){ %>
		<div class="homeBtns d-flex justify-content-between">
		<h3> <%=libro.getNomeLibro()%></h3>
		
		</div>
		<%} %>
	</div>
</body>
</html>
