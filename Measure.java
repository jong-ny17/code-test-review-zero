package javatu;
import java.util.stream.IntStream;

public class Measure {
	//���� n�� �Ű������� �־��� ��, n�� ����� ������������ ���� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
    public int[] solution(int n) {    	        
        
        return IntStream.rangeClosed(1, n).sorted().filter(item -> n%item == 0).toArray();
    }
}
