/* 생성자가 오버로딩이 되면 자바 컴파일로는 매개변수가 없는 기본생성자를 더이상 묵시적으로 제공하지 않는다
 * 
 */
class Member07{
	private String mem_id;
	private String mem_pwd;
	private String mem_name;
	
	public Member07(String mem_id, String mem_pwd, String mem_name) {
		this.mem_id=mem_id;
		this.mem_pwd=mem_pwd;
		this.mem_name=mem_name;
	}
	
	public void print_Member() {
		System.out.println("아이디: "+mem_id+", 비번: "+mem_pwd+", 이름: "+mem_name);
	}
}

public class ObjTest07 {
	public static void main(String[] args) {
		//Member07 member = new Member07();//묵시적으로 제공되지 않는 기본생성자를 호출할혀다가 에러가 발생
		//member.print_Member();
		
		Member07 member2 = new Member07("abc56789", "7777", "세종");
		member2.print_Member();
	}
}
