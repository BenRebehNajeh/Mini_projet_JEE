package model;

public class Matiere {
	 private int idMatiere;
	    private String libMat;
	    private double nbreHeure;
	    private double coefficient;
	    private double credit;

	    public Matiere() {
	      
	    }

	    // Constructor
	    public Matiere(int idMatiere, String libMat, double nbreHeure, double coefficient, double credit) {
	        this.idMatiere = idMatiere;
	        this.libMat = libMat;
	        this.nbreHeure = nbreHeure;
	        this.coefficient = coefficient;
	        this.credit = credit;
	    }

	    // Getters and Setters

	    public int getIdMatiere() {
	        return idMatiere;
	    }

	    public void setIdMatiere(int idMatiere) {
	        this.idMatiere = idMatiere;
	    }

	    public String getLibMat() {
	        return libMat;
	    }

	    public void setLibMat(String libMat) {
	        this.libMat = libMat;
	    }

	    public double getNbreHeure() {
	        return nbreHeure;
	    }

	    public void setNbreHeure(double nbreHeure) {
	        this.nbreHeure = nbreHeure;
	    }

	    public double getCoefficient() {
	        return coefficient;
	    }

	    public void setCoefficient(double coefficient) {
	        this.coefficient = coefficient;
	    }

	    public double getCredit() {
	        return credit;
	    }

	    public void setCredit(double credit) {
	        this.credit = credit;
	    }

}
