package LevelZero;

public class RemoveString {
    // letter 로 받은 특정 문자를 제거한 my_string 을 return으로 반환
    class Solution {
        public String solution(String my_string, String letter) {
            String answer = my_string.replace(letter, "");
            return answer;
        }
    }
    // ?
}
