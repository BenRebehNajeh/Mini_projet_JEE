package metier;

import java.util.List;

import model.Absences;
import model.Details;
import model.Etudiant;
import model.Groupe;
import model.Matiere;
import model.Salle;
import model.Seance;

public interface AbsenceInterface {
	  List<Etudiant> listAbsences();
	    List<Matiere> listMatiere();
	    int createAbsence(Absences a);
	    void createDetailsAbsence(Details a);

	    List<Etudiant> getListEtudById(int id);
	Matiere getMatiereDetails(int id);
	Groupe getGroupeDetails(int id);
	Salle getSalleDetails(int id);
	Seance getSeanceDetails(int id);

	    void deleteAbsence(int id);
		List<Groupe> listGoupe();
		List<Salle> listSalle();
		List<Seance> listSeance();
		Etudiant getEtudiantDetails(int id);


}
