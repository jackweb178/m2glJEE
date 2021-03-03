package gn.balde.devoir.repository;

import gn.balde.devoir.domain.Classe;
import gn.balde.devoir.domain.Matiere;
import gn.balde.devoir.domain.Module;
import gn.balde.devoir.domain.Professeur;

import java.util.ArrayList;
import java.util.List;

public class ModuleRepository {

    private static List<Matiere> matieres;
    public  static  final Module[] MODULES = {
            new Module(1,"Module 1",matieres),
            new Module(2,"Module 2", matieres),
    };

    public  Module[] getAll(){return  MODULES;}

    private  final List<Module> modules;

    public ModuleRepository() {
        this.modules = new ArrayList<Module>();
    }

    public Module[] getAllByModule(List<Matiere> matieres){
        modules.add(new Module(1,MODULES[1].getLibelle() ,matieres));
        modules.add(new Module(1,MODULES[1].getLibelle() , matieres));
        modules.add(new Module(1, MODULES[1].getLibelle(), matieres));
        modules.add(new Module(1, MODULES[1].getLibelle(), matieres));
        //return prestataires.toArray();
        return modules.toArray(new Module[0]);
    }

    public Module getById(int id){
        for (int i = 0; i < MODULES.length; i++) {
            if(id == MODULES[i].getId()){
                return MODULES[i];
            }
        }
        return null;
    }
}
