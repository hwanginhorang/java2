/* 생성자의 주된 특징)
 *  1. 생성자는 클래스명과 같다
 *  2. 생성자는 클래스의 구성요소이고, new 클래스명(); 에 의해서 호출된다
 *  3. 전달인자가 없는 생성자를 기본생성자라고 한다
 *  4. 생성ㄷ자명 앞에는 리턴타입이 없다. 메서드 명 앞에는 리턴타입이 있다. 생성자는 메서드의 일종이다.
 */
class MyDate03{
	private int year=2023;
	private int month=6;
	private int date=10;
	
	public MyDate03() {
		System.out.println("기본생성자 호출");
	}//매개변수가 없는 기본생성자
	
	public void print() {
		System.out.println(year+"년"+month+"월"+date+"일");
	}
}
public class ObjTest03 {
	public static void main(String[] args) {
		new MyDate03();//기본생성자 호출
		new MyDate03().print();//기본생성자 호출하면서 메서드도 호출
	}
}
