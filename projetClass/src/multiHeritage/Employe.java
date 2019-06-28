package multiHeritage;


public class Employe extends Gens {
	
	protected double Salaire;

	public Employe(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.Salaire=salaire;
	}

	public String toString(){
	 	String str = super.toString() + "\n \t ==>>" + this.Salaire + "euros";
	    return str;
	    } 
	
	public double getSalaire() {
		return Salaire;
	}

	public void setSalaire(double salaire) {
		Salaire = salaire;
	}
	
}
