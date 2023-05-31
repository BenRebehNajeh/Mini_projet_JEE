<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css">

	<!-- Import Bootstrap JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="ISO-8859-1">
<title>Gestion Etudiants</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
<div class="container">
<center><h3>Ajouter Etudiant</h3></center>
<div class="row">
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Nom et Prenom d'etudiant : </label>
  <input type="text" class="form-control" id="fullname" placeholder="foulen ben foulen ">
</div>
<div class="mb-3">
  <label for="date" class="form-label">Date de naissance d'etudiant :</label>
    <input type="date" id="birthdate" name="birthdate" class="form-control"></div>
    
</div>
<br>
<div class="row">
<button type="button" class="btn btn-primary">

Submit

</button>  </div>
</div>
</body>
</html>