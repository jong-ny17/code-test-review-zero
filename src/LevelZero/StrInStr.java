package javatu;

public class StrInStr {
	//���ڿ� str1, str2�� �Ű������� �־����ϴ�. str1 �ȿ� str2�� �ִٸ� 1�� ���ٸ� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
    public int solution(String str1, String str2) {
        
        return str1.contains(str2) ?  1  :  2;
    }

}
