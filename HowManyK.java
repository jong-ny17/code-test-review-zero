package javatu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HowManyK {
	// 1���� 13������ ������, 1�� 1, 10, 11, 12, 13 �̷��� �� 6�� �����մϴ�. ���� i, j, k�� �Ű������� �־��� ��,
	// i���� j���� k�� �� �� �����ϴ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	public int solution(int i, int j, int k) {
		
		return (int)IntStream.rangeClosed(i, j).map(item -> 
			item = (int) Arrays.stream(String.valueOf(item).split("")).filter(element -> element.equals(String.valueOf(k))).count()).sum();
	}
}
