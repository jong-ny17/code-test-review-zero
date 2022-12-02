package javatu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Decryption {
	// 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
	//암호화된 문자열 cipher를 주고받습니다.
	//그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
	// 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
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
