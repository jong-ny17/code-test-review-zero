package javatu;

public class RemoveVowel {
	// 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
	
	   public String solution(String my_string) {
		   
		   String[] vowel = {"a" , "e" , "i" , "o" , "u" };
		   
		   for (int i = 0; i < vowel.length; i++) {
			   my_string = my_string.replace(vowel[i] , "");
		}
	        
		   // 한 줄로 코딩해서 값 찾기
//		   return my_string.replaceAll("^[aeioe]", ""); ^ : 제외하고 전부를 말하는 정규식
//		   return my_string.replaceAll("[aeioe]", "");
	        return my_string;
	    }
}
