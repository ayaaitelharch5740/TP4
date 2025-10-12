package ma.projet.test;

import ma.projet.bean.Article ;
import ma.projet.bean.Categorie ;

public class TestApp {
	
	public static void main(String[] args) {

        
        Categorie c1 = new Categorie("OP", "Ordinateur Portable");
        Categorie c2 = new Categorie("OP", "Ordinateur Poste");

        
        Categorie[] categories = { c1, c2 };

        
        Article a1 = new Article(14, "DELL INSPIRON", c1);
        Article a2 = new Article(4, "SONY VAIO", c1);
        Article a3 = new Article(74, "TERRA", c2);
        Article a4 = new Article(785, "HP Compaq", c2);

        
        Article[] articles = { a1, a2, a3, a4 };

        
        for (int i = 0; i < categories.length; i++) {
            Categorie cat = categories[i];
            System.out.println("\nCatégorie : " + cat.getLibelle());

            for (int j = 0; j < articles.length; j++) {
                Article art = articles[j];
                if (art.getCategorie().getId() == cat.getId()) {
                    System.out.println("  - " + art);
                }
            }

            
        }
    }

}
