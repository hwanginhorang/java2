/* 생성자의 주된 기능은 클래스 소속 멤버변수 중 인스턴스 변수 초기화 기능이다
 * 
 */
class Member04{
	private String member_id;
	private String member_name;
	private String member_phone;
	
	public Member04() {
		this.member_id="abc56789";
		member_name="홍길동";//this.생략가능
		member_phone="010-9999-9999";//생성자의 주된 기능인 인스턴스 변수 초기화
	}
	
	public void pr() {
		System.out.println("아이디:"+member_id+",회원이름:"+member_name+",폰번호:"+member_phone);
	}
}
public class ObjTest04 {
	public static void main(String[] args) {
		Member04 member = new Member04();
		member.pr();
	}
}
