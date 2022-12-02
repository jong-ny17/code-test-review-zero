package javatu;

import java.util.Arrays;

public class FindNumbers {
	// ���� num�� k�� �Ű������� �־��� ��, num�� �̷�� ���� �߿� k�� ������ num�� �� ���ڰ� �ִ� �ڸ� ���� return�ϰ�
	// ������ -1�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
    public static int solution(int num, int k) {
    	int answer = -1;
    	int[] a = Arrays.stream(String.valueOf(num).split("")).mapToInt(item -> item.equals(String.valueOf(k)) ? -1 : Integer.valueOf(item)).toArray();
    	for (int i = 0; i < a.length; i++) {    		
			if(a[i] == -1) {
				return i+1;
			}
		}
    	return answer;
    }
    
    public static void main(String[] args) {
		System.err.println(solution(232443,9));
	}
}
