package model;

public class Groupe {
	  private int idgroupe;
	    private String libellegroupe;
	    private int niveau;
	    private int annee;
	    private int nbreEtudiant;

	    public Groupe () {
	        
	    }
	    public Groupe(int idgroupe, String libellegroupe, int niveau, int annee, int nbreEtudiant) {
	        this.idgroupe = idgroupe;
	        this.libellegroupe = libellegroupe;
	        this.niveau = niveau;
	        this.annee = annee;
	        this.nbreEtudiant = nbreEtudiant;
	    }

	    public int getIdgroupe() {
	        return idgroupe;
	    }

	    public void setIdgroupe(int idgroupe) {
	        this.idgroupe = idgroupe;
	    }

	    public String getLibellegroupe() {
	        return libellegroupe;
	    }

	    public void setLibellegroupe(String libellegroupe) {
	        this.libellegroupe = libellegroupe;
	    }

	    public int getNiveau() {
	        return niveau;
	    }

	    public void setNiveau(int niveau) {
	        this.niveau = niveau;
	    }

	    public int getAnnee() {
	        return annee;
	    }

	    public void setAnnee(int annee) {
	        this.annee = annee;
	    }

	    public int getNbreEtudiant() {
	        return nbreEtudiant;
	    }

	    public void setNbreEtudiant(int nbreEtudiant) {
	        this.nbreEtudiant = nbreEtudiant;
	    }

}
