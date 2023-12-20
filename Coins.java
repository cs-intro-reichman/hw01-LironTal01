/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		
	//Get a number of cents as a commandline argument
	int num1 = Integer.parseInt(args[0]);
	
	//Calculate the number of quarters and cents
	int quarters = num1 / 25;
	int cents = num1 % 25;

	//Print the calculation
	System.out.println(" Use " + quarters + " quarters and " + cents + " cents");
	
	}
}