package com.exercice2;

public class Main {
	public static void main(String[] args) {
        
        Filiere info   = new Filiere("Informatique");
        Filiere genie  = new Filiere("Génie Civil");

        
        Étudiant e1 = new Étudiant("El Idrissi", "Mohamed");
        Étudiant e2 = new Étudiant("Bentaleb", "Fatima");
        Étudiant e3 = new Étudiant("Chouaib",   "Youssef");
        Étudiant e4 = new Étudiant("Lahlou",    "Salma");
        Étudiant e5 = new Étudiant("Roussafi",  "Hassan");
        Étudiant e6 = new Étudiant("Amrani",    "Aïcha");

        
        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
       
        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(new Étudiant("Belkahia", "Khadija"));
        genie.ajouterEtudiant(new Étudiant("Laaroussi","Walid"));

        
        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        
        System.out.println("Détail de e3 : " + e3);
    }
}
