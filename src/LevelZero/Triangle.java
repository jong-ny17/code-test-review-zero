package javatu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Triangle {	
		//���� �� ���� �ﰢ���� ����� ���ؼ��� ������ ���� ������ �����ؾ� �մϴ�.
		//���� �� ���� ���̴� �ٸ� �� ���� ������ �պ��� �۾ƾ� �մϴ�.
		//�ﰢ���� �� ���� ���̰� ��� �迭 sides�� �Ű������� �־����ϴ�. �� ������ �ﰢ���� ���� �� �ִٸ� 1, ���� �� ���ٸ� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		
	    public int solution(int[] sides) {
	    		    
	       	List<Integer> list = Arrays.stream(sides).sorted().boxed().collect(Collectors.toList());
	       	
	      return list.get(0)+list.get(1) > list.get(2) ?  1 : 2 ;      		    		   
	}
	    
	    public static void main(String[] args) {
			Triangle aa = new Triangle();
			int[] aaa = {199 , 72 , 222};
			System.err.println(aa.solution(aaa));
		}
}