package javatu;

public class Pizza2 {
	// �Ӿ��̳� ���ڰ��Դ� ���ڸ� ���� �������� �߶� �ݴϴ�. ���ڸ� �������� ����� �� n�� �Ű������� �־��� ��, n���� �ֹ��� ���ڸ� ������
	// �ʰ� ��� ���� ���� ���� ������ �Ծ�� �Ѵٸ� �ּ� �� ���� ���Ѿ� �ϴ����� return �ϵ��� solution �Լ��� �ϼ��غ�����.
    public static int solution(int n) {
    	int pizza = 1 ;
    	int count = 6 ;
    	
        while (n>0) {
        	if(count%n ==0) {
        		break;
        	}
			pizza ++;
			count += 6;
			
		}
        return pizza;
    }
    public static void main(String[] args) {
		System.err.println(solution(4));
	}

}
