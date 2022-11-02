package javatu;

import java.util.Arrays;

//머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한 발음밖에 하지 못합니다. 
//문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
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
