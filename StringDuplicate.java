package javatu;

import java.util.*;
import java.util.stream.Collectors;

public class StringDuplicate {
	// ���ڿ� my_string�� �Ű������� �־����ϴ�. my_string���� �ߺ��� ���ڸ� �����ϰ� �ϳ��� ���ڸ� ���� ���ڿ���
	// return�ϵ��� solution �Լ��� �ϼ����ּ���.
	public String solution(String my_string) {		
		return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
	}

}
