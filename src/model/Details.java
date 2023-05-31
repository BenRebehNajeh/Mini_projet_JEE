package model;

public class Details {
	 private int iddetailsAbs;
	    private int absent;
	    private double note;
	    private String observations;
	    private boolean absentt;
	    private int idetudiant;

	    
	    public Details() {
	       
	    }

	    public Details(int iddetailsAbs, int absent, double note, String observations, boolean absentt, int idetudiant) {
	        this.iddetailsAbs = iddetailsAbs;
	        this.absent = absent;
	        this.note = note;
	        this.observations = observations;
	        this.absentt = absentt;
	        this.idetudiant = idetudiant;
	    }

	    // Getters and Setters

	    public int getIddetailsAbs() {
	        return iddetailsAbs;
	    }

	    @Override
		public String toString() {
			return "Details [iddetailsAbs=" + iddetailsAbs + ", absent=" + absent + ", note=" + note + ", observations="
					+ observations + ", absentt=" + absentt + ", idetudiant=" + idetudiant + "]";
		}

		public void setIddetailsAbs(int iddetailsAbs) {
	        this.iddetailsAbs = iddetailsAbs;
	    }

	    public int getAbsent() {
	        return absent;
	    }

	    public void setAbsent(int absent) {
	        this.absent = absent;
	    }

	    public double getNote() {
	        return note;
	    }

	    public void setNote(double note) {
	        this.note = note;
	    }

	    public String getObservations() {
	        return observations;
	    }

	    public void setObservations(String observations) {
	        this.observations = observations;
	    }

	    public boolean isAbsentt() {
	        return absentt;
	    }

	    public void setAbsentt(boolean absentt) {
	        this.absentt = absentt;
	    }

	    public int getIdetudiant() {
	        return idetudiant;
	    }

	    public void setIdetudiant(int idetudiant) {
	        this.idetudiant = idetudiant;
	    }

}
