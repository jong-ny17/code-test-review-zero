package javatu;

import java.util.stream.IntStream;

public class NumberPair {
	// �������̶� �� ���� ���ڸ� ������ ���Ͽ� ¦���� ��Ÿ�� ������ (a, b)�� ǥ���մϴ�. �ڿ��� n�� �Ű������� �־��� �� �� ������ ���� n�� �ڿ��� �������� ������ return�ϵ��� solution �Լ��� �ϼ����ּ���.
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
	// �ð� �ʰ� �� © ���� 
	// �ȿ��� for ���� �ι� ������ �ð��� �ι質 �� ���� ���� for���� ������ �ݺ�Ƚ���� ���� ������ ��� �Ұ� ���� .
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
