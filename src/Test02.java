
public class Test02 {
	public static void main(String[] args) {
        int i;
        int sum=0;
        int hap=0;
        
        for(i=1; i<11; i++) {
        	if(i%2 == 0) {
        		sum += i;
        		
        	}else {
        		hap += i;
        	}
        }
        System.out.println(sum);
        System.out.println(hap);
   }
}