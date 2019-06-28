package heritage2;

public class Batiment {

	private String Adresse;
	
	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public Batiment(String adresse) {
		this.Adresse = adresse;
	}
	
	public String toString() {
		String str = this.Adresse + "(adresse)";
	    return str;
	    }	
}
