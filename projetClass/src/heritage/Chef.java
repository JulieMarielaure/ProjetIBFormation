package heritage;

import java.sql.Date;

public class Chef extends Employe {

	private String Service;
	
	public Chef(String nom, String prenom, Date dateNaissance, int salaire, String service) {
		super(nom, prenom, dateNaissance, salaire);
		this.Service = service;
		// TODO Auto-generated constructor stub
	}
	
	 public String afficher(){
		 	String str = super.afficher() + "\n \t ==>>" + this.Service + " (affecté).";
		    return str;
		    } 
	
	public String getService() {
		return Service;
	}
	public void setService(String service) {
		Service = service;
	}

}
