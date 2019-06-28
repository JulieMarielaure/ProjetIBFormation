package Distance;

import java.util.Scanner;

import rectangle.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Premier point? ");
		double X1 = input.nextDouble();
		double Y1 = input.nextDouble();
		
		System.out.print("Deuxieme point? ");
		double X2 = input.nextDouble();
		double Y2 = input.nextDouble();
		
		Point p = new Point(X1, Y1, Y1, X2, Y2);
		p.distance();
		System.out.println(p.toString());
		
	}

}
