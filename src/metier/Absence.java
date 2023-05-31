package metier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AbsenceDetails;
import model.Absences;
import model.Details;
import model.Etudiant;
import model.Groupe;
import model.Matiere;
import model.Salle;
import model.Seance;

/**
 * Servlet implementation class Absence
 */
@WebServlet("/Absence")
public class Absence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Absence() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String matiere = request.getParameter("matiere");
		String groupe = request.getParameter("groupe");
		String salle = request.getParameter("salle");
		String seance = request.getParameter("seance");
		String date = request.getParameter("date");
		String evalu = request.getParameter("evalu");
		
		// Convert parameter values to appropriate data types
				int idMatiere = Integer.parseInt(matiere);
				int idGroupe = Integer.parseInt(groupe);
				int idSalle = Integer.parseInt(salle);
				int idSeance = Integer.parseInt(seance);
				boolean evaluation = Boolean.parseBoolean(evalu);

				// Create a new instance of the Absences class using the constructor
				Absences absences = new Absences(date, false, evaluation, idSeance, idSalle, idMatiere, idGroupe);

				AbsenceImp metier = new AbsenceImp();
				int id = metier.createAbsence(absences);
				List<Etudiant> ls = metier.getListEtudById(idGroupe);
				Seance se = metier.getSeanceDetails(idSeance);
				Matiere me = metier.getMatiereDetails(idMatiere);
				Salle sa = metier.getSalleDetails(idSalle);
				Groupe ge = metier.getGroupeDetails(idGroupe);
				request.setAttribute("id", id);

				request.setAttribute("etudiantList", ls);
				request.setAttribute("seance", se);
				request.setAttribute("salle", sa);
				request.setAttribute("date", date);

				request.setAttribute("groupe", ge);
				request.setAttribute("matiere", me);
				System.out.println("jjjjjjjjjjjjjjjjjjjjj" + idMatiere);
				RequestDispatcher dispatcher = request.getRequestDispatcher("listEtud.jsp");
				dispatcher.forward(request, response);
				response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String groupe = request.getParameter("etudiantList");
		String seance = request.getParameter("seance");

		AbsenceImp metier = new AbsenceImp();

		int idGroupe = Integer.parseInt(groupe);
		int idSeance = Integer.parseInt(seance);

		List<Etudiant> ls = metier.getListEtudById(idGroupe);
		List<Integer> studentIdList = new ArrayList<>();
		for (Etudiant etud : ls) {
			studentIdList.add(etud.getIdPersonne());
			Details d = new Details();
			boolean absentBool;
			String absent = request.getParameter("absente" + etud.getIdPersonne());
			String note = request.getParameter("note" + etud.getIdPersonne());
			String observe = request.getParameter("observ" + etud.getIdPersonne());

			if (absent != null && absent.length() > 0) {	
				absentBool = true;

			} else {
				absentBool = false;

			}
			d.setAbsent(idSeance);
			d.setNote(Double.parseDouble(note));

			d.setAbsentt(absentBool);
			d.setIdetudiant(etud.getIdPersonne());
			d.setObservations(observe);
			System.out.println(d);
			metier.createDetailsAbsence(d);
		}
		List<AbsenceDetails> absenceDetailsList = metier.getAbsenceDetailsForStudents(studentIdList);

// Store the absence details in the request attribute
		request.setAttribute("absenceDetailsList", absenceDetailsList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listAbsenceDetails.jsp");
		dispatcher.forward(request, response);

	}

}
