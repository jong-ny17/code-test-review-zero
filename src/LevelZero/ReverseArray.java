package javatu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javatu.lengthOfArrayElement.Solution;

public class ReverseArray {
	public static void main(String[] args) {
		
		Integer [] aaaa = {1, 2 , 3 ,5 ,6 };
		Integer[] as  = new ReverseArray().solution(aaaa);

		
		for (int i = 0; i < as.length; i++) {
			System.err.print(as[i] + " ");
		}
		
	}
	// ������ ��� �ִ� �迭 num_list�� �Ű������� �־����ϴ�. num_list�� ������ ������ �Ųٷ� ������ �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	public Integer[] solution(Integer[] num_list) {
        
		List<Integer> list = Arrays.asList(num_list);
		System.err.println(list);
		Collections.reverse(list);
		Integer[] reverse = list.toArray(num_list);
		
		return reverse;
    }
	
	public int [] solution(int[] num_list) {
		
//		  int[] reverseArr = new int[num_list.length];        
//		  for (int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {        
//			  reverseArr[j] = num_list[i];        }
//	
//		
//		return reverseArr;	
		
		List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
		Collections.reverse(list);
		return list.stream().mapToInt(Integer::intValue).toArray();
		
	}

}
