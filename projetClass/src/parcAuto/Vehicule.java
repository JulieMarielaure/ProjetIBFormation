package parcAuto;

public abstract class Vehicule {

	private int Matricule;
	private int Modele;
	private double Prix;
	
	public static int nb_vehicule = 0;
	public abstract void Accelerer(); 
	public abstract void Demarrer(); 

	public Vehicule(int modele, double prix) {
		Matricule = nb_vehicule ++;
		Modele = modele;
		Prix = prix;
	}

	@Override
	public String toString() {
		return "Matricule=" + Matricule + ", Modele=" + Modele + ", Prix=" + Prix + "]";
	}
	
	public int getMatricule() {
		return Matricule;
	}
	
	public void setMatricule(int matricule) {
		Matricule = matricule;
	}
	
	public int getModele() {
		return Modele;
	}
	
	public void setModele(int modele) {
		Modele = modele;
	}
	
	public double getPrix() {
		return Prix;
	}
	
	public void setPrix(double prix) {
		Prix = prix;
	}
	
	public static int getNb_vehicule() {
		return nb_vehicule;
	}
	public static void setNb_vehicule(int nb_vehicule) {
		Vehicule.nb_vehicule = nb_vehicule;
	}
	
}
