package gn.balde.devoir;

import gn.balde.devoir.domain.Classe;
import gn.balde.devoir.domain.Matiere;
import gn.balde.devoir.domain.Module;
import gn.balde.devoir.domain.Professeur;
import gn.balde.devoir.repository.ClasseRepository;
import gn.balde.devoir.repository.MatiereRepository;
import gn.balde.devoir.repository.ModuleRepository;
import gn.balde.devoir.repository.ProfesseurRepository;
import liquibase.pro.packaged.S;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DevoirApp {

    public static void main(String[] args) {
        System.out.println("Bienvenu sur la plateforme de gestion des emplois");
        System.out.println("> l pour lister les services disponibles ");
        Scanner scanner = new Scanner(System.in);
        String menu = scanner.next();

        //ProfesseurRepository professeurRepository = new ProfesseurRepository();
        ClasseRepository classeRepository = new ClasseRepository();
        Classe[] classes = classeRepository.getAll();

        ModuleRepository moduleRepository = new ModuleRepository();
        Module[] modulesListe = moduleRepository.getAll();
        MatiereRepository matiereRepository = new MatiereRepository();

        if ("l".equalsIgnoreCase(menu)){

            /************ Liste des classes ************/
            System.out.println("Liste des classe disponible");
            for (int i = 0 ; i<classes.length ; i++){
                Classe classe = classes[i];
                System.out.println( String.format("== %s %s \n ", classe.getId(),classe.getLibelle()));
            }
        }

        System.out.println("1 Pour voir le nombre de module");
        System.out.println("2 Pour voir les matieres par module");
        System.out.println("3 Rechercher les profs pour une classe donne");

        int choix = scanner.nextInt();

        switch (choix)
        {
            case 1 :
                /************ Liste des module ************/
                System.out.println("Liste des modules enseigne");
                for (int i = 0 ; i<modulesListe.length ; i++){
                    Module module = modulesListe[i];
                    System.out.println( String.format("== %s %s \n ", module.getId(),module.getLibelle()));
                }
            break;

            case 2 :
                System.out.println("Saisir le numero du module");

                int idModule = scanner.nextInt();

                //avoir une classe sur demande
                List<Module> modules = Collections.singletonList(moduleRepository.getById(idModule));

                // afficher les modules par classe
                Matiere[] matieres = matiereRepository.getAllByModule(modules);

                //les profs qui enseigne dans cette classe
                System.out.println(String.format("La liste des matieres du module %s :", modules.get(0).getLibelle()));
                for (int i = 0; i < matieres.length; i++) {
                    Matiere matiere = matieres[i];
                    System.out.println(String.format("> %s %s %s ", matiere.getId(),matiere.getLibelle(),modules.get(0).getLibelle()));
                }
            break;

            case  3 :
                System.out.println("Saisir le numero de la classe");

                int idClasse = scanner.nextInt();

                //avoir une classe sur demande
                List<Classe> classe = Collections.singletonList(classeRepository.getById(idClasse));

                // afficher les modules par classe
                ProfesseurRepository professeurRepository = new ProfesseurRepository();
                Professeur[] professeurs = professeurRepository.getAllByProfesseur(classe);

                //les profs qui enseigne dans cette classe
                System.out.println(String.format("La liste des professeurs %s :", classe.get(0).getLibelle()));
                for (int i = 0; i < professeurs.length; i++) {
                    Professeur professeur = professeurs[i];
                    System.out.println(String.format("> %s %s %s ", professeur.getId(), professeur.getNom(), professeur.getPrenom()));
                }
            break;
        }


    }
}
