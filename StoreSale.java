package javatu;

public class StoreSale {
	// �Ӿ��̳� �ʰ��Դ� 10�� �� �̻� ��� 5%, 30�� �� �̻� ��� 10%, 50�� �� �̻� ��� 20%�� �������ݴϴ�.
	// ������ ���� ���� price�� �־��� ��, �����ؾ� �� �ݾ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
	public int solution(int price) {
		int answer = 0;		
		answer = (int) (price >= 500000 ? price*0.8 : price >= 300000 ? price*0.9 : price >= 100000 ? price*0.95 : price);		
		return answer;

	}
}