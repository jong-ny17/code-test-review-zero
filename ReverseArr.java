package javatu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArr {

	// �迭 ȸ�� ��Ű��
	// ������ ��� �迭 numbers�� ���ڿ� direction�� �Ű������� �־����ϴ�. �迭 numbers�� ���Ҹ� direction��������
	// �� ĭ�� ȸ����Ų �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.	
	    public int[] solution(int[] numbers, String direction) {
	        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

	        if (direction.equals("right")) {
	            list.add(0, list.get(list.size() - 1));
	            list.remove(list.size() - 1);
	        } else {
	            list.add(list.size(), list.get(0));
	            list.remove(0);
	        }
	        return list.stream().mapToInt(Integer::intValue).toArray();
	    }
	

}
