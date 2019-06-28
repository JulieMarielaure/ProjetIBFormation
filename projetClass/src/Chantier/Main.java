package Chantier;

public class Main {

	public static void main(String[] argv) {
		Ouvrier[] ouvrier = new Ouvrier[3];
		ouvrier[0] = new Menuisier("Paul");
		ouvrier[1] = new Plombier("Jean");
		ouvrier[2] = new Menuisier("Adrien");
	
	for (Ouvrier o : ouvrier) {
		System.out.println(o.afficher());
	}
	
	for (int i = 0; i < ouvrier.length; i++) {
	ouvrier[i].afficher();
	}
	
	}
}
