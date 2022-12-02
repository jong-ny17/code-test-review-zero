package javatu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BeforeAfter {
	// ���ڿ� before�� after�� �Ű������� �־��� ��, before�� ������ �ٲپ� after�� ���� �� ������ 1��, ���� �� ������
	// 0�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
	public int solution(String before, String after) {
		
		String beforeStr = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
		String afterStr = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
		if(beforeStr.equals(afterStr)) {
			return 1;
		}else			
		return 0;
	}
}
