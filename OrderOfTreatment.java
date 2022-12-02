package javatu;

import java.util.*;
import java.util.stream.Collectors;

public class OrderOfTreatment {
// �ܰ��ǻ� �Ӿ��̴� ���޽ǿ� �� ȯ���� ���޵��� �������� ���� ������ ���Ϸ��� �մϴ�. 
// ���� �迭 emergency�� �Ű������� �־��� �� ���޵��� ���� ������� ���� ������ ���� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	public static int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];		
		List<Integer> aa= Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if(emergency[i] == aa.get(j)) {
					answer[i] = j+1;
				}
			}
		};
		//return answer;
		int[] e = {1};
		return  Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
	}
	public static void main(String[] args) {
		int[] aa = {1,2,3,4,5};
		System.err.println(solution(aa)[0]);
	}

}
