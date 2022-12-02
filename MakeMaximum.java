package javatu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MakeMaximum {
	 public int solution(int[] numbers) {
	        int answer = 0;
	        List<Integer> list = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
	        int[] result = list.stream().mapToInt(Integer::valueOf).toArray();
	        return (int)result[0]*result[1];	        	        
	    }
}
