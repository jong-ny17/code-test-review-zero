package javatu;

import java.util.Arrays;

public class Dot {
    public int solution(int[] dot) {    	        
        boolean aa = dot[0] > 0;
        boolean bb = dot[1] > 0;
        if(aa == true) {
        	if(bb == true) {
        		return 1;
        	}return 4;        
        }else {
        	if(bb == true) {
        		return 2;
        	}return 3;
        }		        
    }

}
