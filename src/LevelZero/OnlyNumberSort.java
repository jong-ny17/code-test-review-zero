package javatu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OnlyNumberSort {
	//���ڿ� my_string�� �Ű������� �־��� ��, my_string �ȿ� �ִ� ���ڸ� ��� �������� ������ ����Ʈ�� return �ϵ��� solution �Լ��� �ۼ��غ�����.
	
    public int[] solution(String my_string) {
    	    	
//    	Arrays.asList(my_string.replaceAll("[^0-9]" , "").split("")).stream().mapToInt(Integer::valueOf).sorted();
    	   
//    	System.err.println(Arrays.asList(my_string.replaceAll("[^0-9]" , "").split("")).stream().mapToInt(Integer::valueOf).sorted().getClass().getName());    	    	
        
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
    public static void main(String[] args) {
		OnlyNumberSort asd = new OnlyNumberSort();
		System.err.println(asd.solution("1asdasd13ds214rtf"));;
	}

}
