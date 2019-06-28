package heritage;

import java.sql.Date;

public class Personne {
	
	private String Nom;
	private String Prenom;
	private Date DateNaissance;
	
	public Personne(String nom, String prenom, Date dateNaissance) {
		this.Nom = nom;
		this.Prenom = prenom;
		this.DateNaissance = dateNaissance;
	}
	

	  public String afficher(){
		    return "Nom: " + Nom + "\nPrénom : " + Prenom + "\nDate de Naissance : "+ DateNaissance;
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

		public Date getDateNaissance() {
			return DateNaissance;
		}

		public void setDateNaissance(Date dateNaissance) {
			DateNaissance = dateNaissance;
		}

	

}
