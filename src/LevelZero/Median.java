package javatu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Median {
	  public int solution(int[] array) {	        
	        int a = (int) Arrays.stream(array).count();
	        List<Integer> asd = Arrays.stream(array).sorted().boxed().collect(Collectors.toList());
	        a = (int)(a/2 - 1);
	        System.err.println(a);
	        return (asd.get(a));
	    }
	  public static void main(String[] args) {
		Median asd = new Median();
		int[] assa = {1 , 2 ,4 , -1 , 5 , 9 , 10};
		System.err.println(asd.solution(assa));
	}
}
