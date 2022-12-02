package javatu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOfN {
	//���� n�� ���� �迭 numlist�� �Ű������� �־��� ��, numlist���� n�� ����� �ƴ� ������ ������ �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	  public int[] solution(int n, int[] numlist) {	        
	        List<Integer> list = Arrays.stream(numlist).filter(item -> item%n == 0).boxed().collect(Collectors.toList());
	        return list.stream().mapToInt(Integer::intValue).toArray();
	        	        
	    }

}
