package model;

public class AbsenceDetails {
	 private Absences absence;
	    private Etudiant student;
	    private Details details;
	    private Salle sa;
	    private Groupe gp;
	    private Matiere mat;

	    
	    public Salle getSa() {
			return sa;
		}
		public void setSa(Salle sa) {
			this.sa = sa;
		}
		public Groupe getGp() {
			return gp;
		}
		public void setGp(Groupe gp) {
			this.gp = gp;
		}
		public Matiere getMat() {
			return mat;
		}
		public void setMat(Matiere mat) {
			this.mat = mat;
		}
		public AbsenceDetails(Absences absence, Etudiant student, Details details, Salle sa, Groupe gp, Matiere mat) {
			super();
			this.absence = absence;
			this.student = student;
			this.details = details;
			this.sa = sa;
			this.gp = gp;
			this.mat = mat;
		}
		public Absences getAbsence() {
			return absence;
		}
		public void setAbsence(Absences absence) {
			this.absence = absence;
		}
		public Etudiant getStudent() {
			return student;
		}
		public void setStudent(Etudiant student) {
			this.student = student;
		}
		public Details getDetails() {
			return details;
		}
		public void setDetails(Details details) {
			this.details = details;
		}

	  

}
