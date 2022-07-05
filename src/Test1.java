import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(1,2,3,4,5);
		Integer result =0;
		System.out.println(list);
		for(Integer mp:list) {
			if(mp%2!=0) {
			result=result+(mp*mp);
			}
		}
		
	     System.out.println(result);
		}
}
