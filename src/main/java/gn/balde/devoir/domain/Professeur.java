package gn.balde.devoir.domain;

import java.util.List;

public class Professeur {
    private int id;
    private String prenom;
    private String nom;
    private  Classe classes;

    public Professeur(int id, String prenom, String nom, Classe classes) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Classe getClasses() {
        return classes;
    }

    public void setClasses(Classe classes) {
        this.classes = classes;
    }
}
