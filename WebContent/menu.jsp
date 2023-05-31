<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Gestion Etudiants</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css">
	<!-- Import Bootstrap JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Gestion des absences</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item">
						<a class="nav-link" href="http://localhost:8081/najehproject/">Accueil</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="http://localhost:8081/najehproject/addAbsense.jsp">Saisir Absence</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="listAbsenceDetails.jsp">Liste des Absences</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="listEtud.jsp">Liste des Etudiants</a>
					</li>
					
				</ul>
			</div>
		</div>
	</nav>

</body>
</html>
