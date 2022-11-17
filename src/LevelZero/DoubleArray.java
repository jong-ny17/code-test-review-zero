package javatu;

import java.util.Arrays;

public class DoubleArray {
	class Solution {
	    public int[] solution(int[] numbers) {	        
	        
	        for (int i = 0; i < numbers.length; i++) {
				numbers[i] = numbers[i]*2;
			}
	        
	        return numbers;
	    }
	}
}
