package javatu;

import java.util.Arrays;

public class lengthOfArrayElement {
//	���ڿ� �迭 strlist�� �Ű������� �־����ϴ�. strlist �� ������ ���̸� ���� �迭�� retrun�ϵ��� solution �Լ��� �ϼ����ּ���.
	
	class Solution {
	    public int[] solution(String[] strlist) {	    	
//	        int[] answer = new int[strlist.length];	        	        
//	        for (int i = 0; i < strlist.length; i++) {
//	        		int strlist_len = strlist[i].length();	        		
//	        		answer[i] = strlist_len;
//			}
//	        return answer;
	    	
	    	return Arrays.stream(strlist).mapToInt(String::length).toArray();
	    	
	    }
	}

}
