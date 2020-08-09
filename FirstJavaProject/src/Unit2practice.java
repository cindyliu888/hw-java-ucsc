import java.util.Scanner;

public class Unit2practice {
	public static void main(String[] args){
		
		
		double item_num = 10.12345;
		char item_name = 's';
		String item_string = "cindy";
		
		System.out.printf("I have %9.2f %c %s", item_num, item_name, item_string);
		
		
        Scanner s = new Scanner(System.in);

        System.out.println("你好我是JP，請問你的名字是？");
        String name = s.nextLine(); //讀一整行的字串回傳。(包含空白，讀到換行為止)
        System.out.println(name+"，很高興認識你，請問您今年幾歲？");
        int age =s.nextInt(); //找下一個token並轉換成 int 回傳。
        System.out.println(age+"歲呀，可惜我不清處我幾歲 Q_Q");
        System.out.println("嗯...那你喜歡喝什麼飲料呢？");
        String drink =s.next(); //找下一個token並回傳。
        System.out.println(drink+"是嗎！我沒喝過，我馬上去嘗試一下，掰掰囉~");

        System.out.println("===== 系統提示 =====");
        System.out.println("JP(Java Program)已無回應，程式結束。");
        
       
        
        s.close();    // 程式結束前關閉Scanner物件是好習慣。
    }//end of main(String[])
}
