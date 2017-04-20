package com.epsi.gplan.model;

public class Classe {

    private String label;
    private String nbEleves;

    public Classe(String label, String nbEleves) {
        this.label = label;
        this.nbEleves = nbEleves;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNbEleves() {
        return nbEleves;
    }

    public void setNbEleves(String nbEleves) {
        this.nbEleves = nbEleves;
    }
}
