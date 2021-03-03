package gn.balde.devoir.domain;

import java.util.List;

public class Classe {
    private int id;
    private String libelle;

    private Module modules;

    public Classe(int id, String libelle, Module modules) {
        this.id = id;
        this.libelle = libelle;
        this.modules = modules;
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

    public Module getModules() {
        return modules;
    }

    public void setModules(Module modules) {
        this.modules = modules;
    }
}
