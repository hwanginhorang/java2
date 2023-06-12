class Document14{
	static int count = 0;
	String name;
	
	Document14(){
		this("제목없음"+ ++count);
	}
	
	Document14(String name){
		this.name=name;
		System.out.println("문서"+this.name+"이(가) 생성됨.");
	}
}
public class ObjTest14 {
	public static void main(String[] args) {
		new Document14();
		new Document14();
		new Document14("자바.txt");
		new Document14();
	}
}
