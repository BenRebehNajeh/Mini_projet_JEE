package metier;
import java.util.List;

import model.Etudiant;
public class TestMetier {
public static void main(String[] args) {

	AbsenceInterface metier= new AbsenceImp();
//Test d'ajout

List<Etudiant> Etudiants2 = metier.listAbsences();
for (Etudiant u2: Etudiants2)
{
System.out.println(u2);
}
System.out.println("------------------------------\n");
}
}