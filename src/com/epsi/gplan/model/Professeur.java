package com.epsi.gplan.model;

import java.util.ArrayList;
import java.util.Collection;

public class Professeur extends User{

    private Collection<Matiere> sesMatieres;

    public Professeur(String login, String passwd, String nom, String prenom, String mail,Boolean admin) {
        super(login, passwd, nom, prenom, mail,admin);
        sesMatieres = new ArrayList<>();
    }


}
