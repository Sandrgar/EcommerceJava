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
		<div class="homeBtns d-flex justify-content-between">
			<div>
            <%List<Map<UtenteBean, Integer>> listaUtenti = (List<Map<UtenteBean, Integer>>) request.getAttribute("result");  %>
			
			</div>

		</div>
	</div>
</body>
</html>
