package rectangle;

//public visible to all & declare a class .
public class Rectangle {

	//attributes
	private double Longueur;
	private double Largeur;
	private double perimeter;
	private double area;
	
	//encapsulation
	public static double count = 0; 
	
	//Main constructor
	public Rectangle(double longueur, double largeur) {
		this.setLongueur(longueur);
		this.setLargeur(largeur);
	}

	//method to calculate perimeter of rectangle
	public double perimeter() {
		perimeter = 2* (Longueur + Largeur);
		return perimeter;
	}	
	
	//method to calculate area of rectangle
	public double area() {
		area = Longueur * Largeur;
		return area;
	}	
	
	//library
	@Override
	//method for return a string with all attribute
	public String toString() {
		return "Longueur : ["+Longueur+"], Largeur : ["+Largeur+"], "
				+ "Périmètre : ["+perimeter+"], Are :["+area+"]";
	}
	
	public double getLongueur() {
		return Longueur;
	}

	public void setLongueur(double longueur) {
		Longueur = longueur;
	}

	public double getLargeur() {
		return Largeur;
	}

	public void setLargeur(double largeur) {
		Largeur = largeur;
	}
	
	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	public static double getCount() {
		return count;
	}


	public static void setCount(double count) {
		Rectangle.count = count;
	}

}
