/*	자바에서 생성자가 오버로딩이 되면 전달인자가 없는 기본생성자를 자바 컴파일러가 묵시적 제공을 하지 않는다.
 * 	생성자가 오버로딩 안되면 기본생성자를 묵시적 제공한다 즉 생략이 가능한다
 */
class Board06{
	private String board_Name;
	private String board_Title;
	private String board_Content;
	
	public Board06(){
		this.board_Name = "홍길동";
		this.board_Title = "몰라";
		this.board_Content = "없어";
	}
	 
	public void board_print() {
		System.out.println("글쓴이 : "+this.board_Name);
		System.out.println("글제목 : "+this.board_Title);
		System.out.println("글내용 : "+this.board_Content);
	}
}
public class ObjTest06 {
	public static void main(String[] args) {
		Board06 board = new Board06();
		board.board_print();
	}
}
