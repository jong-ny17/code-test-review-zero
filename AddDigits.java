package javatu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AddDigits {
	// ���� n�� �Ű������� �־��� �� n�� �� �ڸ� ������ ���� return�ϵ��� solution �Լ��� �ϼ����ּ���
    public int solution(int n) {
//    	String[] a = String.valueOf(n).split("");
//    	int answer = 0;    	
//    	for (String str : a) {
//    		answer += Integer.valueOf(str);
//    	}
//        return answer;
    	
//    	 String[] split = String.valueOf(n).split("");
//        return Arrays.stream(split).mapToInt(Integer::parseInt).sum();
//    	Integer::parseInt
          return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
          													// item -> Integer.parseInt(item) �̷������� ���� ���� ���� �ݷ� 
    }
}
