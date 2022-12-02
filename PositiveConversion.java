package javatu;

import java.util.Arrays;

public class PositiveConversion {
	// ���� �迭 array�� ���� n�� �Ű������� �־��� ��, array�� ����ִ� ���� �� n�� ���� ����� ���� return �ϵ���
	// solution �Լ��� �ϼ����ּ���.
	public int solution(int[] array, int n) {
  	    int answer = 0;
		int min = 100;
		
		array = Arrays.stream(array).sorted().toArray();
		
        
		for (int i = 0; i < array.length; i++) {
			if(Math.abs(array[i]) - n == 0) {
				answer = array[i];
				return answer;
			}
			if(min > Math.abs(n - array[i]) || array[i] == 0) {
				min = Math.abs(n - array[i]);
				answer = array[i];
			}
		}
		return answer;
    }
}
