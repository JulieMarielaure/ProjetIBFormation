package projetClass;

import java.util.ArrayList;

public class Test {

	//main method
	public static void main(String[] args) {

		// Set the value of the car variable to "BMW"
		Voiture voiture1 = new Voiture("BMW", 220, 8);
		Voiture voiture2 = new Voiture("Ford", 200, 6);
		Voiture voiture3 = new Voiture("Audi", 240, 8);
		
		//create ArrayList
		ArrayList<Voiture> listVoitures =new ArrayList<>();
		
		listVoitures.add(voiture1);
		listVoitures.add(voiture2);
		listVoitures.add(voiture3);
		
		// loop for write all the object cars
		for (Voiture v : listVoitures) {
			System.out.println(v);
		}
		
		//Display message on computer screen.	
		System.out.println("Le nombre des voitures est " + listVoitures.size());
	}

}
