package ServiceInfo;

public class Developpeur extends Geek {

	private String Specialite;
	
	public Developpeur(String nom, String prenom, String mail, String telephone, double salaire, String specialite) {
		this.Id = ++count;
		this.Nom = nom;
		this.Prenom = prenom;
		this.Mail = mail;
		this.Telephone = telephone;
		this.Salaire = salaire;
		this.setSpecialite(specialite);
	}
	
	@Override
	public double calculSalaire() {
		return(Salaire*1.20); 
	}
	
	public String Afficher() {
		return "Le salaire du manager" + Nom + Prenom + " est : "+ calculSalaire() +" , sa spécialité : "+ Specialite;
	}
	public String getSpecialite() {
		return Specialite;
	}
	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	
	
	
}
