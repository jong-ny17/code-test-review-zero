package javatu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OnlyNumberSort {
	//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
	
    public int[] solution(String my_string) {
    	    	
//    	Arrays.asList(my_string.replaceAll("[^0-9]" , "").split("")).stream().mapToInt(Integer::valueOf).sorted();
    	   
//    	System.err.println(Arrays.asList(my_string.replaceAll("[^0-9]" , "").split("")).stream().mapToInt(Integer::valueOf).sorted().getClass().getName());    	    	
        
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
    public static void main(String[] args) {
		OnlyNumberSort asd = new OnlyNumberSort();
		System.err.println(asd.solution("1asdasd13ds214rtf"));;
	}

}
