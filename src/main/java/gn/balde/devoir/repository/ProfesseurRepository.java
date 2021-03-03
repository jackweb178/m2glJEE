package gn.balde.devoir.repository;

import gn.balde.devoir.domain.Classe;
import gn.balde.devoir.domain.Matiere;
import gn.balde.devoir.domain.Module;
import gn.balde.devoir.domain.Professeur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfesseurRepository {
    private  final List<Professeur> professeurs;

    public ProfesseurRepository() {
        this.professeurs = new ArrayList<Professeur>();
    }

    public Professeur[] getAllByProfesseur(List<Classe> classes){
        professeurs.add(new Professeur(1, "Abdoulaye", "Diallo",classes));
        professeurs.add(new Professeur(2, "Mamadou", "Bah",classes));
        professeurs.add(new Professeur(3, "Aboubacar", "Ndiaye",classes));
        professeurs.add(new Professeur(4, "Moustapha", "Balde",classes));
        //return prestataires.toArray();
        return professeurs.toArray(new Professeur[0]);
    }


    public Professeur findById(int idProfesseur) {
       // for (int i = 0 ,pro)

        return null;
    }
}
