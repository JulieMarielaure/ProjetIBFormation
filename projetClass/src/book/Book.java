package book;

//public visible to all & declare a class .
public class Book {

	//attributes
	private int Id;
	private String Title;
	private String Author;
	private double Price;
	
	//encapsulation
	public static int count = 0; 
	
	
	//Main constructor
	public Book(String title, String author, double price) {
		this.Id = ++ count;
		this.Title=title;
		this.Author=author;
		this.Price=price;
	}
	
	//library
	@Override
	//method for return a string with all attribute
	public String toString() {
		return "Title: " + Title + "\nName : " + Author + "\nPrice : "+ Price;
	}
	
	//get method returns the variable value
	public int getId() {
		return Id;
	}

	//set method sets the value
	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Book.count = count;
	}

}
