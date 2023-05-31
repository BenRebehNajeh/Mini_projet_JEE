<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page language="java" import="java.util.ArrayList,metier.*,model.*"%>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Gestion Etudiants</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
<div class="container">
<center><h3>Ajouter Absence</h3></center>
<div class="row">
<form action="Absence" method="get">
<div class="mb-3">
  <label for="date" class="form-label">Matiere :</label>
<select class="form-select" id="matiere" name="matiere"   aria-label="Dropdown list">
  <option selected>Selectionner matiere :</option>
    <%
    AbsenceImp metier = new AbsenceImp();
			ArrayList<Matiere> mat = (ArrayList) metier.listMatiere();
			if (mat != null) {
				
				for (int i = 0; i < mat.size(); i++) 
				{
					out.println("<option value='"+((Matiere) mat.get(i)).getIdMatiere()+"'>"+((Matiere) mat.get(i)).getLibMat()+"</option>");
}
				
			}
		%>

</select>
    
    </div>
    <div class="mb-3">
  <label for="date" class="form-label">Groupe :</label>
<select class="form-select"  id="groupe" name="groupe" aria-label="Dropdown list">
  <option selected>Selectionner groupe :</option>
   <%
    AbsenceImp group = new AbsenceImp();
			ArrayList<Groupe> grp = (ArrayList) group.listGoupe();
			if (grp != null) {
				
				for (int i = 0; i < grp.size(); i++) 
				{
					out.println("<option value='"+((Groupe) grp.get(i)).getIdgroupe()+"'>"+((Groupe) grp.get(i)).getLibellegroupe()+"</option>");
}
				
			}
		%>

</select>
    
    </div>
    
</div>
<div class="row">
   
   <div class="mb-3">
  <label for="date" class="form-label">salle :</label>
<select class="form-select" id="salle" name="salle"  aria-label="Dropdown list">
  <option selected>Selectionner salle :</option>
 <%
    AbsenceImp sall = new AbsenceImp();
			ArrayList<Salle> sal = (ArrayList) sall.listSalle();
			if (grp != null) {
				
				for (int i = 0; i < sal.size(); i++) 
				{
					out.println("<option value='"+((Salle) sal.get(i)).getIdsalle()+"'>"+((Salle) sal.get(i)).getLibellesalle()+"</option>");
}
				
			}
		%>
</select>

</div>
 <div class="mb-3">
  <label for="date" class="form-label">Seance :</label>
<select class="form-select" id="seance" name="seance"  aria-label="Dropdown list">
  <option selected>Selectionner Seance :</option>
 <%
			ArrayList<Seance> seance = (ArrayList) sall.listSeance();
			if (seance != null) {
				
				for (int i = 0; i < seance.size(); i++) 
				{
					out.println("<option value='"+((Seance) seance.get(i)).getIdseance()+"'>"+((Seance) seance.get(i)).getLibelleseance()+"</option>");
}
				
			}
		%>
</select>

</div>
   <div class="mb-3">
  <label for="date" class="form-label">Date :</label>

      <input type="date" id="date" name="date" class="form-control" id="fullname" >
    
    </div>
    <div class="mb-3">

<div class="form-check">
  <input class="form-check-input" type="checkbox" id="evalu" name="evalu">
  <label class="form-check-label" for="exampleCheckbox">
Evalution  </label>
</div>    
    </div>
   

<br>
<div class="row">
<button type="submit" class="btn btn-primary">

Submit

</button>  </div>
</div>
</form>
</div>
</body>
</html>