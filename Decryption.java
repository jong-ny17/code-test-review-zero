package javatu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Decryption {
	// �� ������ �Ӿ��̴� ���� �� ������ ������ ���� ��ȣ ü�踦 ����Ѵٴ� ���� �˾Ƴ½��ϴ�.
	//��ȣȭ�� ���ڿ� cipher�� �ְ�޽��ϴ�.
	//�� ���ڿ����� code�� ��� ��° ���ڸ� ��¥ ��ȣ�Դϴ�.
	// ���ڿ� cipher�� ���� code�� �Ű������� �־��� �� �ص��� ��ȣ ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	public static class Solution {
		public static String solution(String cipher, int code) {	        
	        String aaaa = "";
	        String[] ci = cipher.split("");	        
	        
	        for (int i = 0; i < cipher.length(); i++) {
				if((i+1)%code == 0) {										
					aaaa += ci[i];										
				}
			}	        
	         		        	        
	        return aaaa;
	        //       return IntStream.range(0, cipher.length())
//            .filter(value -> value % code == code - 1)
//            .mapToObj(c -> String.valueOf(cipher.charAt(c)))
//            .collect(Collectors.joining());
	    }
	}
	
	public static void main(String[] args) {
		System.err.println(Solution.solution("dfjardstddetckdaccccdegk", 4));
		
	}
}
