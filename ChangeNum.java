package javatu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeNum {
	// ���ڿ� my_string�� ���� num1, num2�� �Ű������� �־��� ��, my_string���� �ε��� num1�� �ε��� num2��
	// �ش��ϴ� ���ڸ� �ٲ� ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
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
		// List �� ������ �Ŀ� Collections.swap method�� ���ؼ� �ٲܼ� �ִ� ...
		// �̷��� ���� ����� �־��� 
		
		return  Arrays.stream(my_string_arr).collect(Collectors.joining());
		
 

	}
	
	public static void main(String[] args) {
		System.err.println(solution("I love you", 3, 6));
	}

}
