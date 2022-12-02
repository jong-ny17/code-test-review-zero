package javatu;

import java.util.Arrays;

public class FindBigNumber {
	//정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
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
