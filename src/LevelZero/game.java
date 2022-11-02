package javatu;

import java.util.Iterator;
import java.util.stream.IntStream;

public class game {
	public static void main(String[] args) {
		class Solution {
		    public double solution(int[] numbers) {
		    	double sum = 0;
		        double answer = 0;
		        for (int i = 0; i < numbers.length; i++) {
		        	sum += numbers[i];		        			        	
				}
		        
		        double a  = sum/numbers.length * 10;
		        int as = (int) a%10;		        
		        answer =(double) a / 10;
		        
		        if(as == 0 || as == 5) {
		        	return answer;
		        }
		        return 0;
		    }
		}
		
		Solution s = new Solution();		
		int[] arr =  {91 , 62 ,44 ,44 , 86, 78};
		double a = s.solution(arr);
		System.err.println(a);
		String cc = "asdsad";
		String dd = "sdsd";
		System.err.println(cc.equals(dd));
		
	}
	
	
	
	

}
