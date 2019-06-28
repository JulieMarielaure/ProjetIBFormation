package parcAuto;

public class Voiture extends Vehicule {

	public Voiture(int modele, double prix) {
		super(modele, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Accelerer() {
		System.out.println("La voiture démarre...");
	}

	@Override
	public void Demarrer() {
		System.out.println("La voiture accélère...");
	}

	
}
