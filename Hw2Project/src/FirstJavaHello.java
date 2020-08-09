import java.util.Scanner;

public class FirstJavaHello {

	public static void main(String[] args) {
		excercise_2_1();
		excercise_2_2();
		excercise_2_3();
	}
	
	/******************************************************************
	execrcise_2_1
	*******************************************************************/
	public static void excercise_2_1() {
		int radius = 2;
		double area;
		final double pi = 3.142;
		
		area= pi * radius * radius;
		
		area = 1234.123;
		System.out.printf("The area is: %.2f", area);
	}
	
	
	
	/******************************************************************
	execrcise_2_2
	*******************************************************************/
	public static void excercise_2_2() {
		
		int radius;
		double pi, area;
		
		Scanner readInput = new Scanner(System.in);
		
		//extra line feed
		System.out.println();
		System.out.println("Enter the pi: "); 
		radius = readInput.nextInt();
		
		System.out.print("Enter the radius: "); 
		pi = readInput.nextDouble();
		
		area = pi * radius * radius; 
		
		System.out.print("The area is: ");
		System.out.println(area);
		
//		readInput.close();
	}
	
	/******************************************************************
	execrcise_2_2
	*******************************************************************/
	public static void excercise_2_3() {
		
		
		double pi = 3.14;
		double area;
		
		Scanner readInput = new Scanner(System.in);
		
		//extra line feed
		System.out.println(); 
		System.out.print("Enter the radius: "); 
		
		byte newRadius = readInput.nextByte();
		area = pi * newRadius * newRadius;
		 
		System.out.print("The area is: "); 
		System.out.println(area);

		
		
		//extra line feed
		System.out.println();
		System.out.print("What is your first name?: "); 
		char yourInitial = readInput.next().charAt(0);
		System.out.println("Hello Mr. " + yourInitial + ".");
		//the input buffer will still have enter character '\n' // so that needs to be cleaned.
		//You can do that by using .nextLine() method. readInput.nextLine();
		
		//extra line feed
		System.out.println();
		System.out.printf("5185 is fun course.\n\n");
		System.out.printf("First Name \tLast Name\tCity\tZip Code\n"); 
		System.out.printf("----------- \t---------\t---\t--------\n"); 
		System.out.printf("Bill \tClinton \tHarlem\t23144\n");
		System.out.printf("\n");
		//extra line feed
		System.out.println();
		System.out.printf("How do you print double quotes?\n"); 
		System.out.printf("Who said\"Test Scores Can Be Used ....\"\n");

		
		//extra line feed
		System.out.println();
		System.out.print("Please enter your first name?: "); 
		String firstName = readInput.next();
		
		System.out.print("Please enter your last name?: "); 
		String lastName = readInput.next();
		
		System.out.print("Please enter your city?: "); 
		String city = readInput.next();
		
		System.out.print("Please enter your zip code?: "); 
		String zipcode = readInput.next();
		
		//extra line feed
		System.out.println();
		System.out.printf("First Name \tLast Name\tCity\tZip Code\n"); 
		System.out.printf("----------- \t---------\t---\t--------\n"); 
		System.out.printf("%-12s \t%-12s \t%-5s\t%-9s \n",firstName,lastName,city,zipcode);
		System.out.printf("\n");
		
	}

}
