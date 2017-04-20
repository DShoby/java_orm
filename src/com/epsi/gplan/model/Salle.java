package com.epsi.gplan.model;

public class Salle {

    private String label;
    private int nbPlaces;

    public Salle(String label, int nbPlaces) {
        this.label = label;
        this.nbPlaces = nbPlaces;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }
}
