package javatu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OneAppearance {
	// ���ڿ� s�� �Ű������� �־����ϴ�. s���� �� ���� �����ϴ� ���ڸ� ���� ������ ������ ���ڿ��� return �ϵ��� solution �Լ���
	// �ϼ��غ�����. �� ���� �����ϴ� ���ڰ� ���� ��� �� ���ڿ��� return �մϴ�.
	public String solution(String s) {
		
		return Arrays.stream(s.split("")).filter(item -> Arrays.stream(s.split("")).filter(element -> element.equals(item)).count() == 1).sorted().collect(Collectors.joining());
	}
}
