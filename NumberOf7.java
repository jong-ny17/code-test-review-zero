package javatu;

import java.util.Arrays;

public class NumberOf7 {
	class Solution {
// �Ӿ��̴� ����� ���� 7�� ���� �����մϴ�. ���� �迭 array�� �Ű������� �־��� ��, 7�� �� �� �� �ִ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		public int solution(int[] array) {
			
			return Arrays.stream(array).map(item -> 
				item = (int) Arrays.stream(String.valueOf(item).split("")).filter(element -> 
					element.equals("7")
				).count()
			).sum();
		}
	}

}
