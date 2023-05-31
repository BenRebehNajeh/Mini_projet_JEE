package model;

import java.sql.Time;

public class Seance {
	 private int idseance;
	    private String libelleseance;
	    private Time heureDebut;
	    private Time heureFin;
	    public Seance() {
	      
	    }

	    public Seance(int idseance, String libelleseance, Time heureDebut, Time heureFin) {
	        this.idseance = idseance;
	        this.libelleseance = libelleseance;
	        this.heureDebut = heureDebut;
	        this.heureFin = heureFin;
	    }

	    public int getIdseance() {
	        return idseance;
	    }

	    public void setIdseance(int idseance) {
	        this.idseance = idseance;
	    }

	    public String getLibelleseance() {
	        return libelleseance;
	    }

	    public void setLibelleseance(String libelleseance) {
	        this.libelleseance = libelleseance;
	    }

	    public Time getHeureDebut() {
	        return heureDebut;
	    }

	    public void setHeureDebut(Time heureDebut) {
	        this.heureDebut = heureDebut;
	    }

	    public Time getHeureFin() {
	        return heureFin;
	    }

	    public void setHeureFin(Time heureFin) {
	        this.heureFin = heureFin;
	    }

}
