/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		
	//Get 2 integers from command line
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);

	//Print the addition progress and it's reasult
	System.out.println(num1+" + " + num2 + " = "+ (num1+num2));
		
	}
}
