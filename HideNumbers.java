package javatu;

//���ڿ� my_string�� �Ű������� �־����ϴ�. my_string���� ��� �ڿ������� ���� return�ϵ��� solution �Լ��� �ϼ����ּ���.
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
