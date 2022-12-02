package javatu;

import java.util.stream.IntStream;

public class NumberPair {
	// 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
//	public int solution(int n) {
//		int answer = 0;
//		for (int i = 0; i < n+1; i++) {
//			for (int j = 0; j < n+1; j++) {
//				if(i*j == n) {
//					answer = answer + 1;
//				}
//			}
//		}
//		return answer;
//	}
	// 시간 초과 로 짤 당함 
	// 안에서 for 문을 두번 돌려서 시간이 두배나 더 생김 이중 for문은 가능한 반복횟수가 많지 않은걸 써야 할거 같다 .
//	public int solution(int n) {
//		int answer = 0;
//		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			if(n%i == 0) {
//				count++;
//			}
//		}
//		answer = count;
//		return answer;
//	}
	public int solution(int n) {	
		return (int)IntStream.rangeClosed(1, n).filter(item -> n%item == 0).count();
	}
	public static void main(String[] args) {
		NumberPair SD = new NumberPair();
		System.err.println(SD.solution(100));
	}
}
