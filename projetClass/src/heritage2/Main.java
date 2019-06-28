package heritage2;

public class Main {

	private static Maison m1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Batiment B = new Batiment("Marrakech");
		System.out.println(B);
		m1 = new Maison ("Marrakech", 4);
		Maison M2 = new Maison(null, 0);
		M2.setAdresse("Rabat");
		M2.setNbPiece(3);
		System.out.println(M2);
		
		
	}

}
