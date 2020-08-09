import java.util.Scanner;

public class FirstJavaHello {

	public static void main(String[] args) {
		//execrcise_2_1
		
		int radius = 2;
		double area;
		final double pi = 3.142;
		
		area= pi * radius * radius;
		
		
		System.out.print("The area is: "+ area);

	}
	
	
	/******************************************************************
	execrcise_2_2
	*******************************************************************/
	public static void excercise_2_2() {
		
		int radius;
		double pi;
		double area;
		
		Scanner readInput = new Scanner(System.in);
		
		//extra line feed
		System.out.println("Enter the pi: "); 
		System.out.print("Enter the radius: "); 
		
		radius = readInput.nextInt();
		pi = readInput.nextFloat();
		
		area= pi * radius * radius; 
		System.out.print("The area is: ");
		System.out.println(area);
		
	}

}
