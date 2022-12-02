package javatu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeNum {
	// 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에
	// 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
	public static String solution(String my_string, int num1, int num2) {
		
		String[] my_string_arr = my_string.split("");
		String a = my_string_arr[num1];
		String b = my_string_arr[num2];
		
		for (int i = 0; i < my_string_arr.length; i++) {			
			if(i == num1) {				
				 my_string_arr[num2] = a;				 				 
			}else if(i == num2) {
				 my_string_arr[num1] = b;
			}
		}
		
		List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
		Collections.swap(list, num1, num2);
		// List 로 선언한 후에 Collections.swap method를 통해서 바꿀수 있다 ...
		// 이렇게 쉬운 방법이 있었음 
		
		return  Arrays.stream(my_string_arr).collect(Collectors.joining());
		
 

	}
	
	public static void main(String[] args) {
		System.err.println(solution("I love you", 3, 6));
	}

}
