package javatu;

public class FractionalAddition {

	// ù ��° �м��� ���ڿ� �и� ���ϴ� denum1, num1, �� ��° �м��� ���ڿ� �и� ���ϴ� denum2, num2�� �Ű�������
	// �־����ϴ�. �� �м��� ���� ���� ��� �м��� ��Ÿ���� �� ���ڿ� �и� ������� ���� �迭�� return �ϵ��� solution �Լ���
	// �ϼ��غ�����.
	public int[] solution(int denum1, int num1, int denum2, int num2) {
		
		int a = denum1*num2+denum2*num1;
		int b = num1*num2;
		int aa = gcd(a, b);
		int[] answer = {a/aa , b/aa};
		return answer;
	}
	static int gcd(int a, int b){
		while(b!=0){
			int r = a%b;
			a= b;
			b= r;
		}
		return a;
	}	
}
