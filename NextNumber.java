package javatu;

import java.util.Arrays;
import java.util.Iterator;

import javatu.lengthOfArrayElement.Solution;

public class NextNumber {
	//�������� Ȥ�� ������ common�� �Ű������� �־��� ��, ������ ���� �������� �� ���ڸ� return �ϵ��� solution �Լ��� �ϼ��غ�����.
	
	//	[1, 2, 3, 4]	5
	//	[2, 4, 8]	   16
	// �������� �� -> An = Ax + (n-x)d
	// A�� n��° ���� A�� ��° �� / n ��° - �����ִ� ��°�� �ΰ� ���ϱ� 
	// 
	// Tip. �ΰ� �����θ� ���������� 3���� �ִٰ� �����ϰ� Ǯ������ ���� Ǯ�� �־��� ����

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














