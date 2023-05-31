<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@page language="java" import="java.util.*,metier.*,model.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
<div class="container">
 <label for="date" class="form-label">Date : 
   <% 
  out.println(request.getAttribute("date"));
             %>
  </label> <br>
  <label for="date" class="form-label">Matiere :   
  <% 
            Matiere m =(Matiere) request.getAttribute("matiere");
  out.println(m.getLibMat());
             %></label><br>
  <label for="date" class="form-label">Groupe : 
   <% 
            Groupe g =(Groupe) request.getAttribute("groupe");
  out.println(g.getLibellegroupe());

             %>
             
  </label><br>
  <label for="date" class="form-label">Seance :
  
   <% 
            Seance s =(Seance) request.getAttribute("seance");
  out.println(s.getLibelleseance() +"<br> Date debut : " + s.getHeureDebut() + "<br> Date Fin : " +s.getHeureFin());
             %>
  </label><br>
  <label for="date" class="form-label">Groupe :
  
  <% 
            Salle sa =(Salle) request.getAttribute("salle");
  out.println(sa.getLibellesalle());
  
  
             %>
  </label><br>
<form action="Absence" method="post">
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom Complet</th>
      <th scope="col">Absent(e)</th>
      <th scope="col">Note</th>
            <th scope="col">Observation</th>
      
    </tr>
  </thead>
   <tbody>
            <% 
            out.print("<input type='hidden' name='etudiantList' id='etudiantList' value='"+g.getIdgroupe()+"'>");
            out.print("<input type='hidden'  name='seance' id='seance' value='"+ request.getAttribute("id")+"'>");

            List<Etudiant> etudiantList = (List<Etudiant>) request.getAttribute("etudiantList");
            int i = 0 ;
            if (etudiantList != null) {
                for (Etudiant etudiant : etudiantList) {
                	i++;
            %>
            <tr>
                <td><%=  i %></td>
                <td><%= etudiant.getNom() +" " +etudiant.getPrenom() %></td>
                                <td>
                                <div class="form-check">
        <% out.println("<input class='form-check-input' type='checkbox' id='absente"+etudiant.getIdPersonne()+"' name='absente"+etudiant.getIdPersonne()+"'>"); %> 
</div>    
    </div></td>
      <td>
                                <div class="form-check">
        <% out.println("<input class='form-control' type='text' id='note"+etudiant.getIdPersonne()+"' name='note"+etudiant.getIdPersonne()+"'>"); %> 
</div>    
    </div></td>
     <td>
                                <div class="form-check">
        <% out.println("<input class='form-control' type='text' id='observ"+etudiant.getIdPersonne()+"' name='observ"+etudiant.getIdPersonne()+"'>"); %> 
</div>    
    </div></td>
                
            </tr>
            <% 
                }
            } else {
            %>
            <tr>
                <td colspan="2">No students found</td>
            </tr>
            <% } %>
        </tbody>
</table>
<div class="row">
<button type="submit" class="btn btn-primary">
valider
</button>  
<button onclick="href='addAbsence.jsp'" class="btn btn-primary">Back</button>
</div>

</form>
</div>

</body>
</html>