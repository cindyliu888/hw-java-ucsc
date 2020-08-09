

class BigBox{ 
	static void drawHsize(int h, String hStr) {
		int i = 0;
		 do {
			System.out.print(hStr);
		} while(++i < h);
	}
	
	static void drawVsize(int h, int v, String hStr, String vStr) {
		int i = 0;
		 do {
			System.out.print(vStr);
			drawHsize(h-2, hStr);
			System.out.print(vStr);
			System.out.print("\n");
		} while(++i < v - 2);
	}
	
	static void drawBox(int h, int v, String hStr, String vStr, String fillerStr) {
		
		drawHsize(h,hStr);
		System.out.print("\n");
		drawVsize(h, v, fillerStr, vStr);
		drawHsize(h,hStr);
		System.out.print("\n");
	}
}

public class Hw4_exercise3 {

	public static void main(String[] args) {
		
		int hSize = 20;
		int vSize = 10;
	    
		BigBox.drawBox(20, 10, "-" , "|" , " ");
	
	}
	
}
