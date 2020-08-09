import java.util.Scanner;


public class Demo_Unitlll_weekly {
	
	public static void main(String[] args) {
		
		Scanner getInput = new Scanner (System.in);
		
	    int[] weeklyTemp = {69, 80, 71, 72, 73, 43, 23};
		int day;
		for (day=0; day < 7; day++) {
			System.out.printf("Enter Temperature on day %d:",day);
			weeklyTemp[day] = getInput.nextInt();
		}
		System.out.println();
		
		int min = weeklyTemp[0];
		int max = weeklyTemp[0];
		int total = 0;
		for (day=0; day < 7; day++) {
			
			System.out.printf("The temperature on day %d was %d\n", day+1, weeklyTemp[day]);
				
			if (weeklyTemp[day] < min) {
				min = weeklyTemp[day];
			}else if (weeklyTemp[day] > max) {
				max = weeklyTemp[day];
			}
			
			total += weeklyTemp[day];
	
			System.out.printf("Average in this week was %d;\n", total / (day+1));
			System.out.printf("Mix on day %d was %d; Max on day %d was %d;\n", day+1, min, day+1, max);
			System.out.println();
			
		}
		
		//comparing arrays
		int [] weeklyTemp3 = {69, 70, 71, 68, 66, 71, 70};
		int [] weeklyTemp4 = {69, 70, 71, 68, 66, 71, 70};
		
		//what do you think will be printed?
		if (weeklyTemp3 == weeklyTemp4)
		{
			System.out.println("These two are equal arrays");
		}else{
			System.out.println("These two are unequal arrays"); // you are comparing the reference
		}
		
	}
}
