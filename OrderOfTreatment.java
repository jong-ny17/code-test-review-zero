package javatu;

import java.util.*;
import java.util.stream.Collectors;

public class OrderOfTreatment {
// 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
// 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
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
