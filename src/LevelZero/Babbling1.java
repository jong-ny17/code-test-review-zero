package javatu;

import java.util.Arrays;

//�Ӿ��̴� �¾ �� 6���� �� ��ī�� ������ �ֽ��ϴ�. ��ī�� ���� "aya", "ye", "woo", "ma" �� ���� ������ �ִ� �� ���� ����� ������ �����ۿ� ���� ���մϴ�. 
//���ڿ� �迭 babbling�� �Ű������� �־��� ��, �Ӿ����� ��ī�� ������ �� �ִ� �ܾ��� ������ return�ϵ��� solution �Լ��� �ϼ����ּ���.
public class Babbling1 {
	 public int solution(String[] babbling) {
		 String[] banList = {"ayaaya", "yeye", "woowoo", "mama"};
		 String[] speakingList = {"woo" , "ye" , "aya" , "ma"};
	        int answer = 0;
	        
	        for (String str : babbling) { 
	            String tempStr = str;
	            for (String ban : banList) {
	                tempStr = tempStr.replace(ban, "z");
	            }
	            
	            for (String speak : speakingList) {
	                tempStr = tempStr.replace(speak, "");
	            }
	            
	            if (tempStr.length() == 0) {
	                answer++;
	            }
	            
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
		 
		 String[] str = {"aya", "yee", "u", "maa", "wyeoo"};
		 
		Babbling1 aa = new Babbling1();
		int a = aa.solution(str);
		System.err.println(a);
	}

}
