package javatu;

import java.util.ArrayList;
import java.util.List;

public class HateEven {
	//���� n�� �Ű������� �־��� ��, n ������ Ȧ���� ������������ ��� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	   public int[] solution(int n) {
		   	
		   List<Integer> a = new ArrayList<>();
		   
		   for (int i = 0; i < n+1; i++) {
			a.add(i);
			}		
		   
		   return a.stream().filter(item -> item%2 != 0).mapToInt(Integer::intValue).toArray();
		// return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
	    }
}		
