import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		int month = 0;
		
		System.out.print("현재 월을 입력>>");
		
		Scanner scan=new Scanner(System.in);
		month=Integer.parseInt(scan.nextLine());
		
		if(month==3 || month==4 || month==5) {
			System.out.println("현재는 봄"); 
		}else if(month==6 || month==7 || month==8) {
			System.out.println("현재는 여름"); 
		}else if(month==9 || month==10 || month==11) {
			System.out.println("현재는 가을");
		}else {
			System.out.println("현재는 겨울");
		}
	}
}
