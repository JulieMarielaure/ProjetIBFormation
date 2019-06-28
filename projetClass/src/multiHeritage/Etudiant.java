package multiHeritage;

public class Etudiant extends Gens {

private String Cne;



public Etudiant(String nom, String prenom, String cne) {
	super(nom, prenom);
	Cne = cne;
}



public String toString(){
 	String str = super.toString() + "\n \t ==>>" + this.Cne + "(commune)";
    return str;
    } 



public String getCne() {
	return Cne;
}

public void setCne(String cne) {
	Cne = cne;
}
	
}
