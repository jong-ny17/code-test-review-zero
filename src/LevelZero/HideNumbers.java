package javatu;

//문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
public class HideNumbers {
    public int solution(String my_string) {
    	
    	
        int answer = 0;
        my_string =  my_string.replaceAll("[^123456789]", "");
        for (int i = 0; i < my_string.length(); i++) {
			answer = answer + Integer.parseInt(my_string.substring(i , i+1));
		}
        return answer;
        // return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
        // String.chars() -> charStream ?? 
        
    }
    
    public static void main(String[] args) {
		HideNumbers sd = new HideNumbers();
		System.err.println(sd.solution("sdasdasdas113"));
	}

}
