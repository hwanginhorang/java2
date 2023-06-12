/* add()메서드 첫번째, 두번째 매개변수 자료형 기본타입이어서 값이 전달되고, 세번째 매개변수는 배열 즉 참조타입이라서 배열주소가 전달되어서 값을 공유할 수 있다
 * 
 */
class MtObj01{
	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] result) {
		result[0] = a+b;
	}//전달인자 개수를 다르게 한 메서드 오버로딩  
}
public class ObjTest01 {
	public static void main(String[] args) {
		MtObj01 mt = new MtObj01();
		
		int result = mt.add(3, 5);
		System.out.println("result="+result);
		
		int[] result2= {0};//result2배열의 첫번째 원소값을 0으로 초기화
		mt.add(3, 5, result2);//첫번째 두번째 인자값으로는 값이 전달되고, 세번째 배열은 주소값이 전달됨
		System.out.println("result2[0]="+result2[0]);
	}

}
