package javatu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RockPaperScissors {
	//������ 2 ������ 0 ���� 5�� ǥ���մϴ�. ���� ���� ���� ���� ������� ��Ÿ�� ���ڿ� rsp�� 
	// 2 = 0 , 0 = 5 , 5 = 2
	//�Ű������� �־��� ��, rsp�� ����� ���� ���� ���� ��� �̱�� ��츦 ������� ��Ÿ�� ���ڿ��� return�ϵ��� solution �Լ��� �ϼ��غ�����.
	   public String solution(String rsp) {
		   
		   String[] a = rsp.split("");
		   for (int i = 0; i < a.length; i++) {
			if(a[i].equals("0")) {
				a[i] = "5";
			} else if (a[i].equals("2")) {
				a[i] = "0";
			} else if (a[i].equals("5")) {
				a[i] = "2";
			}
		}		   
		   //return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
	        return String.join("", a);
	    }
	   public static void main(String[] args) {
		RockPaperScissors asd = new RockPaperScissors();
		System.err.println(asd.solution("02502"));
	}
	

}
