package heritage2;

public class Maison extends Batiment {

	private int NbPiece;
	
	public Maison(String adresse, int nbPiece) {
		super(adresse);
		this.NbPiece = nbPiece;
	}
	

	@Override
	//method for return a string with all attribute
	public String toString() {
		String str = super.toString() + "\n \t ==>>" + this.NbPiece + "pièces";
	    return str;
	    }	
	


	public int getNbPiece() {
		return NbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.NbPiece = nbPiece;
	} 
}
