package com.example.tp;

public class Main {
	
	public static void main(String[] args) {
        
        Etudiant e1 = new Etudiant("Alami", "Ahmed");
        Etudiant e2 = new Etudiant("bougssa", "Badr");

        
        e1.ajouterNote(13.0);
        e1.ajouterNote(17.25);
        e1.ajouterNote(12.75);
        e2.ajouterNote(10.5);
        e2.ajouterNote(18.5);

        
        e1.trierNotes();
        e1.afficherNotes();

        
        e1.supprimerDerniereNote();
        e1.afficherNotes();
        System.out.println(e1);

        e2.afficherNotes();
        e1.afficherMeilleureNote();
        System.out.println(e2);
    }	

}
