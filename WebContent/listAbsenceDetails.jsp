<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@page language="java" import="java.util.*,metier.*,model.*"%>

<!DOCTYPE html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css">

<html>
<head>
    <title>Absence Details</title>
</head>
<body>
    <h1>Absence Details</h1>

    <table border="2">
        <tr>
            <th>Student</th>
            <th>Absence Date</th>
            <th>Absent</th>
                        <th>Matiere</th>
                                    <th>Salle</th>
                                                <th>Groupe</th>
            
            <th>Note</th>
            <th>Observations</th>
        </tr>
        <% 
        List<AbsenceDetails> absenceDetailsList = (List<AbsenceDetails>) request.getAttribute("absenceDetailsList");
        if (absenceDetailsList != null) {
            for (AbsenceDetails absenceDetails : absenceDetailsList) {
                %>
                <tr>
                    <td><%= absenceDetails.getStudent().getNom() + " " + absenceDetails.getStudent().getPrenom() %></td>
                    <td><%= absenceDetails.getAbsence().getDateJour() %></td>
<td>
    <% if (absenceDetails.getDetails().isAbsentt()) {
           out.println("Absent(e)");
       } else {
           out.println("Present(e)");
       }
    %>
</td>
                     <td><%= absenceDetails.getMat().getLibMat() %></td>
                     <td><%= absenceDetails.getSa().getLibellesalle() %></td>
                                        <td><%= absenceDetails.getGp().getLibellegroupe() %></td>
                    
                    <td><%= absenceDetails.getDetails().getNote() %></td>
                    <td><%= absenceDetails.getDetails().getObservations() %></td>
                </tr>
                <%
            }
        }
        %>
    </table>
    <br>
    <button><a href="addAbsense.jsp" > New create</a></button>
</body>
</html>