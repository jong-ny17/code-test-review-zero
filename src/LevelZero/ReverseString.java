package LevelZero;

public class ReverseString {
    class Solution {
        //문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
        public String solution(String my_string) {
            StringBuffer sf = new StringBuffer(my_string);
            return sf.reverse().toString();

            // String 클래스를 다루는 StringBuffer 알아두기 ! 너무 간단한 코드
        }
    }
}
