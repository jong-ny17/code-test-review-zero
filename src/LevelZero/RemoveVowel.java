package javatu;

public class RemoveVowel {
	// ����� a, e, i, o, u �ټ� ���� ���ĺ��� �������� �з��մϴ�. ���ڿ� my_string�� �Ű������� �־��� �� ������ ������ ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	
	   public String solution(String my_string) {
		   
		   String[] vowel = {"a" , "e" , "i" , "o" , "u" };
		   
		   for (int i = 0; i < vowel.length; i++) {
			   my_string = my_string.replace(vowel[i] , "");
		}
	        
		   // �� �ٷ� �ڵ��ؼ� �� ã��
//		   return my_string.replaceAll("^[aeioe]", ""); ^ : �����ϰ� ���θ� ���ϴ� ���Խ�
//		   return my_string.replaceAll("[aeioe]", "");
	        return my_string;
	    }
}
