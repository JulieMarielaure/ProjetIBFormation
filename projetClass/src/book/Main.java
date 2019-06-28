package book;

import book.Book;

//Import the Scanner class
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			// Create a Scanner object
			Scanner sc = new Scanner(System.in);
		    System.out.println("Please, enter the title, name and price of your book :");
		    // Read user input
		    // String input
		    String title = sc.nextLine();
		    String author = sc.nextLine();
		    // Numerical input
		    double price = Double.valueOf(sc.nextDouble());	    
		    Book book = new Book(title, author, price);
		    // Output input by user
			System.out.println(book.toString());
		}
		    
		    
	}


