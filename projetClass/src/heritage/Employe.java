package heritage;

import java.sql.Date;

public class Employe extends Personne {

	private int Salaire;
	
	public Employe(String nom, String prenom, Date dateNaissance, int salaire) {
		super(nom,prenom,dateNaissance);
		Salaire = salaire;
		// TODO Auto-generated constructor stub
	}
	
	 public String afficher(){
		 	String str = super.afficher() + "\n \t ==>>" + this.Salaire + "euros";
		    return str;
		    } 

	public int getSalaire() {
		return Salaire;
	}

	public void setSalaire(int salaire) {
		Salaire = salaire;
	}

}
