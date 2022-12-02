package javatu;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MosCode {
	public static String solution(String letter) {
		// �Ӿ��̴� ģ������ �𽺺�ȣ�� �̿��� ������ �޾ҽ��ϴ�. �׳��� ���� �� ���� �̸� �ص��ϴ� ���α׷��� ������� �մϴ�. ���ڿ�
		// letter�� �Ű������� �־��� ��, letter�� ���� �ҹ��ڷ� �ٲ� ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		// �𽺺�ȣ�� ������ �����ϴ�.
		
		String morse =  
			    "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f'," 
				 + "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
			    + "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
			    + "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
			    + "'-.--':'y','--..':'z'" ;
		
		String[] aa = morse.replaceAll("'", "").replaceAll("':'", "").split(",");		
		List<String> aa2 = Arrays.stream(aa).collect(Collectors.toList());		
		Map<String, String> mosCode = new HashMap<String, String>();
		aa2.forEach(i -> {
			String a[] = i.split(":");
			mosCode.put(a[0], a[1]);
		});							
		return Arrays.stream(letter.split(" ")).map(i ->i = mosCode.get(i)).collect(Collectors.joining());
	}
	public static void main(String[] args) {
		System.err.println(solution("-..- -..- -..- -.."));
	}

}
