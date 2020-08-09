import java.util.Scanner;

public class Demo_Unitlll_weekly2 {

	public static void main(String[] args) {
		
		 int [] weeklyTemp = {69, 80, 71, 72, 73, 43, 23};
		 int day;
		 
		 
		 getTemperatures(weeklyTemp);
		 printTemperatures(weeklyTemp);
		 System.out.printf("Mix was %d; Max was %d;\n", getMinTemp(weeklyTemp), getMaxTemp(weeklyTemp));
		 System.out.printf("Average in this week was %5.2f\n", getTotal(weeklyTemp) / 7.0);
	
	}

	
	
	//getTemperatures
	static void getTemperatures(int[] tempArray) {
		Scanner getInput = new Scanner (System.in);
		
		
		for (int day=0; day < tempArray.length; day++) {
			System.out.printf("Enter Temperature on day %d:",day+1);
			tempArray[day] = getInput.nextInt();
		}
		System.out.println();
	}
	//printTemperatures
	static void printTemperatures(int[] tempArray) {
		
		for (int day=0; day < tempArray.length; day++) {
			
			System.out.printf("The temperature on day %d was %d\n", day+1, tempArray[day]);
			
		}
		
	}
	//getMinTemp
	static int getMinTemp(int [] tempArray) {
		int min = tempArray[0];
		int day;
		for (day=1; day < tempArray.length; day++) {
			if (tempArray[day] < min) {
				min = tempArray[day];
			}
		}
		return min;
	}
	//getMaxTemp
	static int getMaxTemp(int [] tempArray) {
		int max = tempArray[0];
		int day;
		for (day=1; day < tempArray.length; day++) {
			if (tempArray[day] > max) {
				max = tempArray[day];
			}
		}
		return max;
	}
	//getTotal
	static int getTotal (int [] tempArray) {
		int total =0;
		int day;
		for (day=1; day < tempArray.length; day++) {
			total += tempArray[day];
		}
		return total;
	}

}
