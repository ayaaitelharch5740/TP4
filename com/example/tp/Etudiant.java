package com.example.tp;

import java.util.Arrays;

public class Etudiant {
	private static int compteur = 0 ;
	private  int id ;
	private String nom;
	private String prenom;
	private double[] notes;
	private int nbNotes;
	
	public Etudiant(String nom, String prenom) {
	    this.id = ++compteur;
	    this.nom = nom;
	    this.prenom = prenom;
	    this.notes = new double[5];
	    this.nbNotes = 0;
	}
	
	public void ajouterNote(double note) {
	    if (nbNotes == notes.length) {
	        double[] tmp = new double[notes.length * 2];
	        System.arraycopy(notes, 0, tmp, 0, notes.length);
	        notes = tmp;
	    }
	    notes[nbNotes++] = note;
	}
	
	public void supprimerDerniereNote() {
        if (nbNotes > 0) {
            nbNotes--; 
            System.out.println("Dernière note supprimée pour " + nom + " " + prenom);
        } else {
            System.out.println("Aucune note à supprimer pour " + nom + " " + prenom);
        }
    }

    
    public void trierNotes() {
        if (nbNotes > 1) {
            double[] notesTriees = Arrays.copyOf(notes, nbNotes);
            Arrays.sort(notesTriees);
            System.arraycopy(notesTriees, 0, notes, 0, nbNotes);
            System.out.println("Notes triées pour " + nom + " " + prenom);
        } else {
            System.out.println("Pas assez de notes à trier pour " + nom + " " + prenom);
        }
    }
    
    public void afficherMeilleureNote() {
        if (nbNotes == 0) {
            System.out.println("Aucune note pour " + nom + " " + prenom);
            return;
        }

        double max = notes[0];
        for (int i = 1; i < nbNotes; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }

        System.out.println("Meilleure note de " + nom + " " + prenom + " : " + max);
    }
	
	public double calculerMoyenne() {
	    if (nbNotes == 0) return 0.0;
	    double somme = 0;
	    for (int i = 0; i < nbNotes; i++) {
	        somme += notes[i];
	    }
	    return somme / nbNotes;
	}
	
	public void afficherNotes() {
	    System.out.print("Notes de " + nom + " " + prenom + " : ");
	    for (int i = 0; i < nbNotes; i++) {
	        System.out.print(notes[i]);
	        if (i < nbNotes - 1) System.out.print(", ");
	    }
	    System.out.println();
	}

	@Override
	public String toString() {
	    return "Etudiant[id=" + id +
	           ", nom=" + nom +
	           ", prenom=" + prenom +
	           ", moyenne=" + String.format("%.2f", calculerMoyenne()) +
	           "]";
	}
	
	
}
