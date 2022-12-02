package javatu;

import java.util.Arrays;

public class FindNumbers {
	// 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
	// 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
    public static int solution(int num, int k) {
    	int answer = -1;
    	int[] a = Arrays.stream(String.valueOf(num).split("")).mapToInt(item -> item.equals(String.valueOf(k)) ? -1 : Integer.valueOf(item)).toArray();
    	for (int i = 0; i < a.length; i++) {    		
			if(a[i] == -1) {
				return i+1;
			}
		}
    	return answer;
    }
    
    public static void main(String[] args) {
		System.err.println(solution(232443,9));
	}
}
