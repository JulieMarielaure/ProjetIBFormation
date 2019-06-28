package Chantier;

public class Ouvrier {

	private String Nom;

	public Ouvrier(String nom) {
		this.Nom = nom;
	}
	
	  public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String afficher(){
		    return "Nom: " + Nom;
		    } 
	  
}
