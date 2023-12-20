/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		
	//Gets from the command line 3 integers as the lengths of the trinagle sides
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	
	//Check if the legths of any two sides is greater than the length of the remaining side
	if ((a + b > c) && (a + c > b) && (b + c > a)) {
		System.out.println(a + ", " + b + ", " + c + ": true"); 
	//Print the lengths + "True" if the three given integers form a triangle
	}
	else {
		System.out.println(a + ", " + b + ", " + c + ": false");
	}
}
}
