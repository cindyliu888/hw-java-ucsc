import java.util.Scanner;
public class Demo_Unitlll_Box {
	
	static void drawHsize(int h, String hStr) {
		int i = 0;
		while(i++ < h) {
			
			System.out.print(hStr);
		}
	}
	
	static void drawVsize(int h, int v, String hStr, String vStr) {
		int i = 0;
		while(i ++ < v - 2) {
			System.out.print(vStr);
			drawHsize(h-2, hStr);
			/*
			j = 0;
			while(j ++ < h - 2 ) {
				System.out.print(" ");
			}
			*/
			System.out.print(vStr);
			System.out.print("\n");
		}
	}
	
	
	public static void main(String[] args) {
		
		int hSize = 20;
		int vSize = 10;
	    
		drawBox(20, 10, "-" , "|" , " ");
		drawBox(30, 20, "+" , "|" , " ");
		
		//default box
		/*
		//system.out.println("------------------")
		drawHsize(hSize,"-");
		System.out.print("\n");
		//system.out.println("|                 |")
		drawVsize(hSize, vSize, " ", "|");
		//system.out.println("------------------")
		drawHsize(hSize,"+");
		System.out.print("\n");
		
		//big box
		drawHsize(30,"-");
		System.out.print("\n");
		drawVsize(30, 20, " ", "|");
		drawHsize(30,"+");
		System.out.print("\n");
		
		*/
		
	
	}
	
	static void drawBox(int h, int v, String hStr, String vStr, String fillerStr) {
		
		drawHsize(h,hStr);
		System.out.print("\n");
		drawVsize(h, v, fillerStr, vStr);
		drawHsize(h,hStr);
		System.out.print("\n");
	}
	
	/*
	static void getSize() {
		
		Scanner getInput = new Scanner(System.in);
		int hSize;
		int vSize;
		System.out.println("Enter hSize:");
		hSize = getInput.nextInt();
		System.out.println("Enter vSize:");
		vSize = getInput.nextInt();
		
	}
	*/
}
