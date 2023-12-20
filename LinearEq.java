/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
	
	//Get 3 numbers as a,b,c
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	double x;
	
	//Print the equation base on a,b,c
	System.out.println(a + " * x + " + b + " = " + c);
	
	//Calculate the equation and find the final value
	x = (c - b) / a;
	
	//Print the reasult of the equation
	System.out.println(" x = " + x);
}
}
