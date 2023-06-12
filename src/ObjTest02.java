class Data02{
	int x;
	
}
class Ref02{
	Data02 copy(Data02 d) {
		Data02 tmp = new Data02();
		tmp.x=d.x;
		
		return tmp;
	}
}
public class ObjTest02 {
	public static void main(String[] args) {	
		Data02 d = new Data02();
		d.x=10;
		
		Ref02 ref = new Ref02();
		Data02 d2 = ref.copy(d);
		
		System.out.println(d.x);
		System.out.println(d2.x);
		
	}
}
