package projetClass;


//public visible to all & declare a class .
public class Voiture {

	//attributes
	private int Id;
	private String Marque;
	private Double Vitesse;
	private int Puissance;

	//general attribute for auto-increment the id
	public static int count = 0; 

	//Main constructor
	public Voiture(String marque, double vitesse, int puissance) {
		this.Id= ++count;
		this.Marque=marque;
		this.Vitesse=vitesse;
		this.Puissance=puissance;
	}

	//library
	@Override
	//method for return a string with all attribute
	public String toString() {
		return "id=" +Id +", marque =" + Marque + " , vitesse=" + Vitesse +" , puissance=" + Puissance;
	}	

	//encapsulation
	private float _vitesse = 0;

	public void Accelerer(float delta) {
		_vitesse += delta;
	}

	public float getvitesse() {
		return _vitesse;
	}

	//get method returns the variable value
	public int getid() {
		return Id;
	}

	//set method sets the value
	public void setId(int id) {
		this.Id = id;
	}
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String marque) {
		this.Marque = marque;
	}
	public Double getVitesse() {
		return Vitesse;
	}
	public void setVitesse(Double vitesse) {
		this.Vitesse = vitesse;
	}
	public int getPuissance() {
		return Puissance;
	}
	public void setPuissance(int puissance) {
		this.Puissance = puissance;
	}

}


