package ma.projet.bean;

public class Categorie {
	 
	private static int compteur = 0;   
    private final int id;
	private String code ;
	private String libelle ;
	
	
   public Categorie( String code , String libelle ) {
	   this.id = ++compteur;
	   this.code = code ;
	   this.libelle = libelle ; 
   }
   
   public int getId() {return id ;}
   
   public String getCode() {return code ;}
   public void setCode(String code) {this.code = code  ;}
   
   public String getLibelle() {return libelle ;}
   public void setLibelle(String libelle) {this.libelle = libelle  ;}

   @Override
   public String toString() {
	return "Categorie [code=" + code + ", libelle=" + libelle + "]";
   }
   
   
   

}
