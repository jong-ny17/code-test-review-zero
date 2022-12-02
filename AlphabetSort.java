package javatu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlphabetSort {
	// ���� ��ҹ��ڷ� �̷���� ���ڿ� my_string�� �Ű������� �־��� ��, my_string�� ��� �ҹ��ڷ� �ٲٰ� ���ĺ� ������� ������
	// ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.

	public String solution(String my_string) {

		return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
	}

}
