import java.util.Scanner;

public class FirstJavaHello {

	public static void main(String[] args) {
		
		exercise_3_1();
		exercise_3_2();
		exercise_3_3();

	}
	
	/******************************************************************
	execrcise_3_1
	*******************************************************************/
	
	public static void exercise_3_1() {
		int yourAge;
		
		Scanner readInput = new Scanner(System.in); 
		
		System.out.printf("How old are you?: "); 
		yourAge= readInput.nextInt();
		
		if (yourAge < 13) {
			System.out.printf("You are a kid\n"); 
		}
		else if(13 <= yourAge && yourAge <= 19){
			System.out.printf("You are a teenager\n");
		}
		else 
			System.out.printf("You are an adult\n");
		
	}
	
	/******************************************************************
	execrcise_3_2
	*******************************************************************/
	
	public static void exercise_3_2() {
		
		float firstN; 
		float secondN; 
		char operator;
		
		Scanner readInput = new Scanner(System.in);
		
		
		char answer = 'y'; 
			
			 
			while(answer == 'y') {
				
				System.out.printf("Type a number, operator, number --" + "separated by a space: ");
				
				firstN = readInput.nextFloat();
				operator = readInput.next().charAt(0); 
				secondN = readInput.nextFloat();
				
				if (operator == '+') { 
					System.out.printf("%f + %f = %f",
							firstN, secondN, firstN + secondN);
				}
				else if (operator == '-') {
					System.out.printf("%f - %f = %f",
						firstN, secondN, firstN - secondN); 
				}
				else if (operator == '*') {
						System.out.printf("%f * %f = %f",
						firstN, secondN, firstN * secondN);
				}
				else if (operator == '/') {
					System.out.printf("%f / %f = %f",
						firstN, secondN, firstN / secondN); 
				}
				else if (operator == '%') {
					System.out.printf("%f %% %f = %f",
						firstN, secondN,firstN % secondN);
				}
				else {
					System.out.printf("Unknown operator"); 
					System.out.printf("\n\n");
				}
				
				System.out.printf("Continue? Type 'y' for yes:");
				answer = readInput.next().charAt(0); 
			}
		

	}
	
	/******************************************************************
	execrcise_3_3
	*******************************************************************/
	public static void exercise_3_3() {
		
		int max; // get value for a and b from user
		Scanner readInput = new Scanner(System.in);
		char answer = 'y'; 
			
		
		while(answer == 'y') {
			
			System.out.printf("Enter three integer numbers to find max of them--seperated by a space");
			
			int firstN = readInput.nextInt();
			int secondN = readInput.nextInt();
			int thirdN = readInput.nextInt();
			
			max = (firstN > secondN) && (firstN > thirdN) ? firstN : (secondN > thirdN) ? secondN : thirdN;
			
			System.out.printf("The max is: %d",max);
			System.out.println();
			System.out.printf("Continue? Type 'y' for yes:");
			answer = readInput.next().charAt(0); 
		}
	

		
	}

}
