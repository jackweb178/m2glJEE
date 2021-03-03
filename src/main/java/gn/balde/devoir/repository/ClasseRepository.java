package gn.balde.devoir.repository;

import gn.balde.devoir.domain.Classe;
import gn.balde.devoir.domain.Module;

import java.util.List;

public class ClasseRepository {
    //public List<Matiere> matieres;
    //public List<Module> modules;


    private static List<Module> modules;

    public static final Classe[] CLASSES = {
        new Classe(1,"Master2 GL",modules),
        new Classe(2, "DITI 1" , modules),
        new Classe(3,"DITI 2", modules),
        new Classe(4,"DITI 3", modules),
    };

    public Classe[] getAll(){ return  CLASSES;}

    public Classe getById(int id){
        for (int i = 0; i < CLASSES.length; i++) {
            if(id == CLASSES[i].getId()){
                return CLASSES[i];
            }
        }
        return null;
    }
}
