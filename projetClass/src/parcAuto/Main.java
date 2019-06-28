package parcAuto;

public class Main {

	public static void main(String[] args) {
		Voiture v = new Voiture(2005,200000);
		System.out.println(v);
		v.Demarrer();
		v.Accelerer();
		Camion c = new Camion(2003, 4560000);
		System.out.println(c);
		c.Demarrer();
		c.Accelerer();
	}

}
