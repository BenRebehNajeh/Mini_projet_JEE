package model;

import java.util.Date;

public class Etudiant {
	 private int idPersonne;
	    private String nom;
	    private String prenom;
	    private String adresseMail;
	    private String tel;
	    private Date dateNaissance;
	    private boolean sexe;
	    private String photo;
	    private String numInscription;
	    public Etudiant() {
	      
	    }

	    // Constructor
	    public Etudiant(int idPersonne, String nom, String prenom, String adresseMail, String tel, Date dateNaissance, boolean sexe, String photo, String numInscription) {
	        this.idPersonne = idPersonne;
	        this.nom = nom;
	        this.prenom = prenom;
	        this.adresseMail = adresseMail;
	        this.tel = tel;
	        this.dateNaissance = dateNaissance;
	        this.sexe = sexe;
	        this.photo = photo;
	        this.numInscription = numInscription;
	    }

	    // Getters and Setters

	    public int getIdPersonne() {
	        return idPersonne;
	    }

	    public void setIdPersonne(int idPersonne) {
	        this.idPersonne = idPersonne;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    public String getAdresseMail() {
	        return adresseMail;
	    }

	    public void setAdresseMail(String adresseMail) {
	        this.adresseMail = adresseMail;
	    }

	    public String getTel() {
	        return tel;
	    }

	    public void setTel(String tel) {
	        this.tel = tel;
	    }

	    public Date getDateNaissance() {
	        return dateNaissance;
	    }

	    public void setDateNaissance(Date dateNaissance) {
	        this.dateNaissance = dateNaissance;
	    }

	    public boolean isSexe() {
	        return sexe;
	    }

	    public void setSexe(boolean sexe) {
	        this.sexe = sexe;
	    }

	    public String getPhoto() {
	        return photo;
	    }

	    public void setPhoto(String photo) {
	        this.photo = photo;
	    }

	    public String getNumInscription() {
	        return numInscription;
	    }

	    public void setNumInscription(String numInscription) {
	        this.numInscription = numInscription;
	    }

	    public Date getDateNaissaince() {
	        return dateNaissance;
	    }

	    public void setDateNaissaince(Date dateNaissaince) {
	        this.dateNaissance = dateNaissaince;
	    }

		@Override
		public String toString() {
			return "Etudiant [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", adresseMail="
					+ adresseMail + ", tel=" + tel + ", dateNaissance=" + dateNaissance + ", sexe=" + sexe + ", photo="
					+ photo + ", numInscription=" + numInscription + "]";
		}

}
