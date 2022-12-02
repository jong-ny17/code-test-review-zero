package javatu;

import java.util.Arrays;
import java.util.Iterator;

import javatu.lengthOfArrayElement.Solution;

public class NextNumber {
	//등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
	
	//	[1, 2, 3, 4]	5
	//	[2, 4, 8]	   16
	// 등차수열 식 -> An = Ax + (n-x)d
	// A의 n번째 수는 A의 번째 수 / n 번째 - 갖고있는 번째수 두개 곱하기 
	// 
	// Tip. 두개 갯수로만 비교하지말고 3개가 있다고 생각하고 풀었으면 쉽게 풀수 있었던 문제

	  public int solution(int[] common) {
		
		  int answer = 0 ;
		  
		  if((common[1] - common[0]) == (common[2]-common[1])) {
			  answer = common[common.length-1] + (common[1] - common[0]);
		  }else {
			  answer = common[common.length-1]*(common[1]/common[0]);
		  }
		  return answer;
	  }
}














