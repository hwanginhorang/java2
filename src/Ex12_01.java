class Ex{
	void p(int a, int b) {
		if(a>b) {
			System.out.println(a);
		}
	}
	
	void v(double a, double b) {
		if(a<b) {
			System.out.println(b);
		}
	}
}
public class Ex12_01 {
	public static void main(String[] args) {
		Ex e = new Ex();
		e.p(100, 50);
		e.v(50.0, 25.0);
	}
}
