package ServiceInfo;

public abstract class Geek {
	
	public static int count = 0; 
	protected int Id;
	protected String Nom;
	protected String Prenom;
	protected String Mail;
	protected String Telephone;
	protected double Salaire;

	public abstract double calculSalaire(); 
	
	
	
}
