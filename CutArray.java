package javatu;

import java.util.Arrays;

public class CutArray {
	
	// 배열 , 시작하는 시점 , 끝나는 시점으로 리턴하는 logic 구현 
	
	static class  Solution {
//	    public int[] solution(int[] numbers, int num1, int num2) {	        
//	        
//	    	int[] asdasd = new int[num2-num1+1];
//	    	int a = num1;
//	    	for (int i = 0; i < asdasd.length; i++) {	    
//	    		
//	    		asdasd[i] = numbers[a];
//	    		a++;
//	    		System.err.println(asdasd[i]);
//			}	    	
//	    	return asdasd;
//	    }
	    
    public int[] solution(int[] numbers, int num1, int num2) {	        
	        
	    	
	    	return Arrays.copyOfRange(numbers, num1, num2+1);
	    }
	   
	}

}
