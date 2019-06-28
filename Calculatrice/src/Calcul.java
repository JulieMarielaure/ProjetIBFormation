import java.util.Scanner;

public class Calcul {

	private int number1;
	private int number2;
	private int rslt;

	
	public static int addition (int number1, int number2) {
		int rslt = number1 + number2;
		return rslt;
	}
	
	public static int soustraction (int number1, int number2) {
		int rslt = number1 - number2;
		return rslt;
	}
	
	public static int multiplication (int number1, int number2) {
		int rslt = number1 * number2;
		return rslt;
	}
	
	public static int division (int number1, int number2) {
		int rslt = number1 / number2;
		return rslt;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getRslt() {
		return rslt;
	}

	public void setRslt(int rslt) {
		this.rslt = rslt;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
}
