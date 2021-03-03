package gn.balde.devoir.repository;

import gn.balde.devoir.domain.Classe;
import gn.balde.devoir.domain.Matiere;
import gn.balde.devoir.domain.Module;
import gn.balde.devoir.domain.Professeur;

import java.util.ArrayList;
import java.util.List;

public class MatiereRepository {

    private static Module modules;

    public static  final Matiere[] MATIERES= {
            new Matiere(1,"JEE" ,modules),
            new Matiere(2, "DevOps",modules),
            new Matiere(3,"WebService",modules),
            new Matiere(4,"Busness Intelligence",modules)
    };

    public Matiere[] getAll(){ return  MATIERES;}

    public Matiere getById(int id){
        for (int i = 0; i < MATIERES.length; i++) {
            if(id == MATIERES[i].getId()){
                return MATIERES[i];
            }
        }
        return null;
    }

    private  final List<Matiere> matieres;

    public MatiereRepository() {
        this.matieres = new ArrayList<Matiere>();
    }

    public Matiere[] getAllByModule(Module modules){
        matieres.add(new Matiere( MATIERES[0].getId(),MATIERES[0].getLibelle(), modules));
        matieres.add(new Matiere( MATIERES[1].getId(),MATIERES[1].getLibelle(), modules));
        matieres.add(new Matiere( MATIERES[2].getId(),MATIERES[2].getLibelle(), modules));
        matieres.add(new Matiere( MATIERES[3].getId(),MATIERES[3].getLibelle(), modules));
        //return prestataires.toArray();
        return matieres.toArray(new Matiere[0]);
    }
}
