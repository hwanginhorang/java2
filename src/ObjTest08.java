/*	this 키워드를 사용해야 하는 이유)
 * 클래스 소속의 멤버변수 중 인스턴스 변수 (속성)
 * 앞에 this.을 사용하지 않으면 자바는 어느 것이 인스턴스 변수인지, 전달인자인지 구분을 못해서 값을 저장 못한다
 */
class MyDate08{
	
	private int year;
	private int month;
	private int date;
	
	public MyDate08() {
		
	}
	public MyDate08(int year, int month, int date) {
		year=year;
		this.month=month;
		this.date=date;
	}
	public void pr() {
		System.out.println(year+"년"+month+"월"+date+"일");
	}
}
public class ObjTest08 {
	public static void main(String[] args) {
		MyDate08 md = new MyDate08(2023, 6, 12);
		md.pr();
	}
}
