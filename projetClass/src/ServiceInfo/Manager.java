package ServiceInfo;

public class Manager extends Geek {

	private String Service;
	
	public Manager(String nom, String prenom, String mail, String telephone, double salaire, String service) {
		this.Id = ++count;
		this.Nom = nom;
		this.Prenom = prenom;
		this.Mail = mail;
		this.Telephone = telephone;
		this.Salaire = salaire;
		this.Service=service;
	}
	
	@Override
	public double calculSalaire() {
		return(Salaire*1.35); 
	}
	
	public void Afficher() {
		System.out.println("Le salaire du manager" + Nom + Prenom + " est : "+ calculSalaire() +" , son service : "+ Service);
	}

	
	public String getService() {
		return Service;
	}
	
	public void setService(String service) {
		Service = service;
	}

	
	
}
