package javatu;

public class MaxValue {
	// ���� �迭 numbers�� �Ű������� �־����ϴ�. numbers�� ���� �� �� ���� ���� ���� �� �ִ� �ִ��� return�ϵ���
	// solution �Լ��� �ϼ����ּ���.
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
		// �� �迭�� �ִ밪 ���ϴ� ���� ���� for ���� ���ؼ� �Ҽ��� ������ ��� �����غ��� �ϴ� ������ ���ؼ� ���ڸ� ��ũ�⺰�� ������ ���·�
		// �Ǿ� �� ���ڸ� / �� �ڿ� �� ���ڸ��� ���ؼ� ���³� �� �ִ°� ���� ���� ����̿����� ����

	}

	public static void main(String[] args) {
		int[] answer = { 1, -2, 3, 5, 6, 7, -9 };
		System.err.println(solution(answer));
	}
}
