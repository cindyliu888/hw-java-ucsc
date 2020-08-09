
public class Demo_Unitlll {
	public static void main(String[] args) {
		final int hSize = 20;
		final int vSize = 10;
		
		//system.out.println("------------------")
		
		int count = 0;
		while(count++ < hSize) {
			
			System.out.print("-");
		}
		
		System.out.print("\n");
		
		
		//system.out.println("|                 |")
		int count2 = 0;
		while(count2 ++ < vSize) {
			System.out.print("|");
			count = 0;
			while(count ++ < hSize - 2 ) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.print("\n");
		}
		
		//system.out.println("------------------")
		count = 0;
		while(count++ < hSize) {
			
			System.out.print("-");
		}
	
	}
}
