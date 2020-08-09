
public class Demo_Unitlll_Char {
	
	public static void main(String[] args) {
		char c = 'a';
		if (Character.isDigit(c)) {
			System.out.printf("%c is a digit\n", c);
			
		}else {
			System.out.printf("%c is not a digit\n", c);
		}
		
		String myString = " What ever you want to put here. ";
		System.out.printf("My string length is\n", myString.length());
		System.out.printf("The char at 5 position is %c\n", myString.charAt(5));
		System.out.printf("The first occurance of character %c is at %d position\n",'t', myString.indexOf('t', 0)); //from index
		System.out.printf("The next occurance of character %c is at %d position\n",'t', myString.indexOf('t', 5));
		System.out.printf("Substring start from 5 is: %s\n", myString.substring(10));
		System.out.println();
		System.out.printf("Upper: %s\n", myString.toUpperCase());
		System.out.printf("Lower: %s\n", myString.toLowerCase());
		System.out.printf("Trim: %s\n", myString.trim()); //開頭和結尾的空格省略
		
	}
	
	
}
