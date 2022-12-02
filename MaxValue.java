package javatu;

public class MaxValue {
	// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
	// solution 함수를 완성해주세요.
	public static int solution(int[] numbers) {
		int maxValue = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (j != i) {
					if (maxValue < numbers[i] * numbers[j]) {
						maxValue = numbers[i] * numbers[j];
					}
				}
			}
		}
		return maxValue;
		// 두 배열의 최대값 구하는 문제 이중 for 문을 통해서 할수도 있지만 사실 생각해보면 일단 정렬을 통해서 숫자를 값크기별로 정렬한 상태로
		// 맨앞 값 두자리 / 맨 뒤에 값 두자리를 곱해서 나태낼 수 있는게 가장 좋은 방법이였던거 같음

	}

	public static void main(String[] args) {
		int[] answer = { 1, -2, 3, 5, 6, 7, -9 };
		System.err.println(solution(answer));
	}
}
