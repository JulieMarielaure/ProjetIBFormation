package ServiceInfo;

public class Main {

	public static void main(String[] args) {
	
		
		Manager manager = new Manager("Lachgar", "Mohamed", "mail1", "gkkg", 30000.0, "Informatique");
		
		Developpeur developpeur = new Developpeur("Salim", "Karim", "mail2", "gkkg", 10000.0, "PHP");
	
		manager.Afficher();
		System.out.println(developpeur.Afficher());
	

	}

}
