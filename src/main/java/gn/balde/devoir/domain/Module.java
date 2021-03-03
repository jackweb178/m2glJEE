package gn.balde.devoir.domain;

import java.util.List;

public class Module {
    private int id;
    private String libelle;
    private List<Matiere> matieres;

    public Module(int id, String libelle, List<Matiere> matieres) {
        this.id = id;
        this.libelle = libelle;
        this.matieres = matieres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }
}
