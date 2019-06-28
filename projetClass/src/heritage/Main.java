package heritage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne[] personne= new Personne[8] ;
		personne[0]= new Employe("Ares", "ave", null, 620) ;
		personne[1]= new Employe ("Apollon", "bili", null, 900) ;
		personne[2]= new Employe ("Aphrodite ", "cora", null, 600) ;
		personne[3]= new Employe ("Arthemis", "danu", null, 400) ;
		personne[4]= new Employe ("Athena", "edou", null, 500) ;
		personne[5]= new Chef("Zeus ", "f", null, 300, "lumos") ;
		personne[6]= new Chef("Cupidon", "guy", null, 700, "dark") ;
		personne[7]= new Directeur("Cronos", "hara", null, 200, "grey", "bigbang") ;
		  
		//for ( int i = 0 ; i< personne.length ; ++i){
		//	System.out.println(personne[i].afficher());
		//	}
		
		for (Personne p : personne) {
			System.out.println(p.afficher());
		}
	}

}
