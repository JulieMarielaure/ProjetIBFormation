package multiHeritage;

public class Professeur extends Employe {

	
	private String Specialite;
	
	public Professeur(String nom, String prenom, double salaire, String specialite) {
		super(nom, prenom, salaire);
		this.Specialite=specialite;
		
	}

	public String toString(){
	 	String str = super.toString() + "\n \t ==>>" + this.Specialite + "(Specialite)";
	    return str;
	    } 
	
	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

}
