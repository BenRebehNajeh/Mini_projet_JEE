package model;

public class Absences {
	 public Absences(String dateJour, boolean verrouille, boolean evaluation, int idseance, int idsalle,
				int idmatiere, int idgroupe) {
			super();
			this.dateJour = dateJour;
			this.verrouille = verrouille;
			this.evaluation = evaluation;
			this.idseance = idseance;
			this.idsalle = idsalle;
			this.idmatiere = idmatiere;
			this.idgroupe = idgroupe;
		}

		private int idAbsence;
	    private String dateJour;
	    private boolean verrouille;
	    private boolean evaluation;
	    private int idseance;
	    private int idsalle;
	    private int idmatiere;
	    private int idgroupe;

	    public int getIdAbsence() {
	        return idAbsence;
	    }

	    public void setIdAbsence(int idAbsence) {
	        this.idAbsence = idAbsence;
	    }

	    public String getDateJour() {
	        return dateJour;
	    }

	    public void setDateJour(String dateJour) {
	        this.dateJour = dateJour;
	    }

	    public boolean isVerrouille() {
	        return verrouille;
	    }

	    public void setVerrouille(boolean verrouille) {
	        this.verrouille = verrouille;
	    }

	    public boolean isEvaluation() {
	        return evaluation;
	    }

	    public void setEvaluation(boolean evaluation) {
	        this.evaluation = evaluation;
	    }

	    public int getIdseance() {
	        return idseance;
	    }

	    public void setIdseance(int idseance) {
	        this.idseance = idseance;
	    }

	    public int getIdsalle() {
	        return idsalle;
	    }

	    public void setIdsalle(int idsalle) {
	        this.idsalle = idsalle;
	    }

	    public int getIdmatiere() {
	        return idmatiere;
	    }

	    public void setIdmatiere(int idmatiere) {
	        this.idmatiere = idmatiere;
	    }

	    public int getIdgroupe() {
	        return idgroupe;
	    }

	    public void setIdgroupe(int idgroupe) {
	        this.idgroupe = idgroupe;
	    }

}
