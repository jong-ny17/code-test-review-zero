package javatu;

public class FindSquared {
    public int solution(int n) {
    	//� �ڿ����� �������� �� ������ ������ ��������� �մϴ�. ���� n�� �Ű������� �־��� ��, n�� ��������� 1�� �ƴ϶�� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.    	        
        return Math.pow((int)Math.sqrt(n), 2) == n ? 1 : 2;
        
        
    }

}
