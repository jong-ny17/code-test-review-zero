package javatu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Game369 {
	// �Ӿ��̴� ģ����� 369������ �ϰ� �ֽ��ϴ�. 369������ 1���� ���ڸ� �ϳ��� ��� 3, 6, 9�� ���� ���ڴ� ���� ��� 3, 6,
	// 9�� ������ŭ �ڼ��� ġ�� �����Դϴ�. �Ӿ��̰� ���ؾ��ϴ� ���� order�� �Ű������� �־��� ��, �Ӿ��̰� �ľ��� �ڼ� Ƚ����
	// return �ϵ��� solution �Լ��� �ϼ��غ�����.
	public int solution(int order) {				
		return (int) Arrays.stream(String.valueOf(order).split("")).mapToInt(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
	}
}
