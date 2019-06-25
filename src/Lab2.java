import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		//1.) Get user input for length.
		System.out.print("\n" + "Enter Length: ");
		double length = scan.nextDouble();

		
		//2.) Get user input for width.
		System.out.print("Enter Width: ");
		double width = scan.nextDouble();

		if (length <= 0) {
			System.out.println("Error: Looking for a number greater than 0.");
		}
			
		if (width <= 0) {
			System.out.println("Error: Looking for a number greater than 0.");
		}
			
		
		//Area of a rectangle -> A = width * length
		System.out.println("Area: " + width * length);
		
		
		//Perimeter of a rectangle -> P = 2(l + w) 
		System.out.println("Perimeter: " +  2 * (length + width));

		
		
		scan.close();	
	}
}
