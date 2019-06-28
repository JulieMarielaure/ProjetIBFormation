package multiHeritage;

public class Gens {

	protected int Id;
	protected String Nom;
	protected String Prenom;
	
	public static int count = 0; 
	
	public Gens(String nom, String prenom) {
		this.Id = ++ count;
		this.Nom = nom;
		this.Prenom = prenom;
	}
	
	@Override
	//method for return a string with all attribute
	public String toString() {
		return "id=" +Id +", nom =" + Nom + " , prenom=" + Prenom;
	}

	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
}
