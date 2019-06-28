package parcAuto;

public class Camion extends Vehicule {

	public Camion(int modele, double prix) {
		super(modele, prix);
		
	}

	@Override
	public void Accelerer() {
		System.out.println("Le camion démarre...");
	}

	@Override
	public void Demarrer() {
		System.out.println("Le camion accélère...");
	}

	
	
}
