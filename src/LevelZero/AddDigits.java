package javatu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AddDigits {
	// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
    public int solution(int n) {
//    	String[] a = String.valueOf(n).split("");
//    	int answer = 0;    	
//    	for (String str : a) {
//    		answer += Integer.valueOf(str);
//    	}
//        return answer;
    	
//    	 String[] split = String.valueOf(n).split("");
//        return Arrays.stream(split).mapToInt(Integer::parseInt).sum();
//    	Integer::parseInt
          return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
          													// item -> Integer.parseInt(item) 이런식으로 생략 가능 이중 콜론 
    }
}
