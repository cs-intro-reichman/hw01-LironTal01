/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {

	//Gets 2 integers from command line as the range
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	
	//Generates 3 random numbers
	int num1 = (int)(Math.random()*(b-a)+a);
	int num2 = (int)(Math.random()*(b-a)+a);
	int num3 = (int)(Math.random()*(b-a)+a);

	//Prints the 3 numbers that i had generated
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);

	//Finding the minimal number out of the 3 numbers
	int min = Math.min(Math.min(num1,num2), num3);

	System.out.println("The minimal generated number was " + min);
	}
}
