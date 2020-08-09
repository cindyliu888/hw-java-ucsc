import java.util.Scanner;
public class Hw4_exercise {
	
    // Here you write the complete code for exercise# 1
	public static void excercise_4_1() {
		System.out.println("4.1");
		
		//4.1.a
		System.out.println("a) How many times this loop is executed?");
		System.out.println("Answer: 10.");
		int i = 0;
		while (i++ < 10) {
		System.out.println("Hello World: " + i); }
		System.out.println();
		
		//4.1.b
		System.out.println("b) How many times this loop is executed if we changed the counter increment to ++i?");
		System.out.println("Answer: 9.");
		i = 0;
		while (++i < 10) {
		System.out.println("Hello World: " + i); }
		System.out.println();
		
		//4.1.c
		System.out.println("c) How many times this loop is executed, if it is executed immediately after the loop in #b, i.e. i is not reinitialized before the loop?");
		System.out.println("Answer: 0.");
		
		while (++i < 10) {
		System.out.println("Hello World: " + i);
		}
		System.out.println();
		
	}

	// Here you write the complete code for exercise# 4.2
	public static void excercise_4_2(int h, int v, String hStr, String vStr, String fillerStr) {
		System.out.println("4.2 while");
		
		int i = 0;
		while(i++ < h) {
			System.out.print(hStr);
		} 
		System.out.print("\n");
		
		i = 0;
		while(i ++ < v - 2) {
			System.out.print(vStr);
			int j = 0;
			while(j ++ < h - 2 ) {
				System.out.print(fillerStr);
			}
			System.out.print(vStr);
			System.out.print("\n");
		}
		
		i = 0;
		while(i++ < h) {
			System.out.print(hStr);
		}
		
	}

	// Here you write the complete code for exercise# 4.3
	public static void excercise_4_3(int h, int v, String hStr, String vStr, String fillerStr) {
		System.out.println();
		System.out.println("4.3 do while");
		
		int i = 0;
		do {
			System.out.print(hStr);
		} while(++i < h);
		System.out.print("\n");
		
		i = 0;
		do {
			System.out.print(vStr);
			int j = 0;
			do {
				System.out.print(fillerStr);
			}while(++ j < h - 2 );
			System.out.print(vStr);
			System.out.print("\n");
		}while(++ i  < v - 2);
		
		i = 0;
		do {
			System.out.print(hStr);
		}while(++i < h);
	}
	
	// Here you write the complete code for exercise# 4.4
	public static void excercise_4_4(int h, int v, String hStr, String vStr, String fillerStr) {
		System.out.println();
		System.out.println("4.4 for loop");
		
		for (int i = 0; i < v; i ++) {
			if (i == 0 || i == v - 1) { // top line and bottom line
				for(int j = 0; j < h; j++) {
					System.out.print(hStr);
				}
			} else { // middle line
				System.out.print(vStr);
				for (int j = 0; j < h - 2; j ++) {
					System.out.print(fillerStr);
				}
				System.out.print(vStr);
			}
			System.out.print("\n");
		}
	}
		
	public static void excercise_4_5() {
		System.out.println();
		System.out.println("4.5");
		
		Scanner readInput = new Scanner(System.in);
		System.out.println("Enter height size:");
		int h = readInput.nextInt();
		System.out.println("Enter width siz:");
		int v = readInput.nextInt();
		System.out.println("Please enter a horizontal character: ");
		String hStr = readInput.next();
		System.out.println("Please enter a vertical  character: ");
		String vStr = readInput.next();
		
		excercise_4_4(h, v, hStr , vStr , " ");
	}
	
	public static void excercise_4_6() {
		System.out.println();
		System.out.println("4.6");
		Scanner readInput = new Scanner(System.in);
		
		while (true) {
			System.out.println("Do you want to draw a new box? (y/n) ");
			char c  = readInput.next().charAt(0);
			boolean repeat = (c == 'y' || c == 'Y');
			if (!repeat) {
				break;
			}
			excercise_4_5();
		}
		
	}
	
	public static void main(String[] args) {
		
		// now call these methods
		excercise_4_1(); 
		excercise_4_2(20, 10, "-" , "|" , " ");  
		excercise_4_3(20, 10, "-" , "|" , " "); 
		excercise_4_4(20, 10, "-" , "|" , " "); 
		excercise_4_5();
		excercise_4_6();
	}
}


