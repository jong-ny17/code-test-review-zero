package javatu;


import java.util.*;

public class FindingTheMode {	
	public int solution(int[] array) {
		// �ֺ��� �־��� �� �߿��� ���� ���� ������ ���� �ǹ��մϴ�. ���� �迭 array�� �Ű������� �־��� ��, �ֺ��� return �ϵ���
		// solution �Լ��� �ϼ��غ�����. �ֺ��� ���� ���� -1�� return �մϴ�.		
		 int maxCount = 0;
	        int answer = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int number : array){
	            int count = map.getOrDefault(number, 0) + 1;
	            if(count > maxCount){
	                maxCount = count;
	                answer = number;
	            }
	            else  if(count == maxCount){
	                answer = -1;
	            }
	            map.put(number, count);
	        }
	        return answer;
	        //Map ���� �ҷ����� Ű�� �� ���� , ������ 0���� default ���� �༭ maxvalue�� �� �ο������� �ʴ´�. 
	}
}
