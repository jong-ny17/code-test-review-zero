package javatu;

import java.util.Arrays;

public class FindBigNumber {
	//���� �迭 array�� �Ű������� �־��� ��, ���� ū ���� �� ���� �ε����� ���� �迭�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
	  public int[] solution(int[] array) {
		  	
		  int aa = 0;
		  int n = 0;
		  for (int i = 0; i < array.length; i++) {			  	
			  if(n < array[i]) {
				  aa = i;
				  n = array[i];
			  }
			}		 
	        int[] answer = {n , aa};
	        return answer ;
	    }
}
