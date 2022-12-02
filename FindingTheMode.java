package javatu;


import java.util.*;

public class FindingTheMode {	
	public int solution(int[] array) {
		// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
		// solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.		
		 int maxCount = 0;
	        int answer = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int number : array){
	            int count = map.getOrDefault(number, 0) + 1;
	            if(count > maxCount){
	                maxCount = count;
	                answer = number;
	            }
	            else  if(count == maxCount){
	                answer = -1;
	            }
	            map.put(number, count);
	        }
	        return answer;
	        //Map 으로 불러오는 키와 값 지정 , 없으면 0으로 default 값을 줘서 maxvalue에 값 부여해주지 않는다. 
	}
}
