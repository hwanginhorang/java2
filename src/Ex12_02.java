class Ex02{
	private String comp = "갑을회사";
	private int size = 8;
	
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		comp = comp;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
public class Ex12_02 {
	public static void main(String[] args) {

		Ex02 e = new Ex02();
		
		e.setComp("갑을회사");
		e.setSize(8);
		
		System.out.println("회사명: "+e.getComp());
		System.out.println("메모리 용량:"+e.getSize()+"g");
	}
}
