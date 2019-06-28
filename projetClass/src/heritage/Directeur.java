package heritage;

import java.sql.Date;

public class Directeur extends Chef {
	
	private String Societe;
	
	public Directeur(String nom, String prenom, Date dateNaissance, int salaire, String service, String societe) {
		super(nom, prenom, dateNaissance, salaire, service);
		this.Societe=societe;
	}

	public String afficher(){
		 	String str = super.afficher() + "\n \t ==>>" + this.Societe + " (Compagnie).";
		    return str;
		    } 
	
	 public String getSociete() {
		return Societe;
	}


	public void setSociete(String societe) {
		Societe = societe;
	}
}
