
	class Box{
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
				System.out.print(vStr);
				System.out.print("\n");
			}
		}
		
		static void drawBox(int h, int v, String hStr, String vStr, String fillerStr) {
			
			drawHsize(h,hStr);
			System.out.print("\n");
			drawVsize(h, v, fillerStr, vStr);
			drawHsize(h,hStr);
			System.out.print("\n");
		}
	}
	
	
	public class UseBox {
		
		public static void main(String[] args) {
			
			int hSize = 20;
			int vSize = 10;
		    
			Box.drawBox(20, 10, "-" , "|" , " ");
			Box.drawBox(30, 20, "+" , "|" , " ");
		
		}
	}
	
	
	

