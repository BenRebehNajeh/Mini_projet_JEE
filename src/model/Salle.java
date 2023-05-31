package model;

public class Salle {
	private int idsalle;
    private String libellesalle;
    private int etage;
    private String bloc;
    private int capacite;

    public Salle () {}
    public Salle(int idsalle , String libellesalle, int etage, String bloc, int capacite) {
    	 this.idsalle = idsalle;
        this.libellesalle = libellesalle;
        this.etage = etage;
        this.bloc = bloc;
        this.capacite = capacite;
    }

    public int getIdsalle() {
		return idsalle;
	}

	public void setIdsalle(int idsalle) {
		this.idsalle = idsalle;
	}

	public String getLibellesalle() {
        return libellesalle;
    }

    public void setLibellesalle(String libellesalle) {
        this.libellesalle = libellesalle;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

}
