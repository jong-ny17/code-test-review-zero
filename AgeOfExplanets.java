package javatu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AgeOfExplanets {
	// ���ֿ����� �ϴ� �Ӿ��̴� ���� �������� PROGRAMMERS-962 �༺�� �ҽ����ϰ� �ƽ��ϴ�. �Ա��ɻ翡�� ���̸� ���ؾ� �ϴµ�,
	// PROGRAMMERS-962 �༺������ ���̸� ���ĺ����� ���ϰ� �ֽ��ϴ�. a�� 0, b�� 1, c�� 2, ..., j�� 9�Դϴ�. ����
	// ��� 23���� cd, 51���� fb�� ǥ���մϴ�. ���� age�� �Ű������� �־��� �� PROGRAMMER-962�� ���̸� return�ϵ���
	// solution �Լ��� �ϼ����ּ���.
	public String solution(int age) {
		String[] messek = String.valueOf(age).split("");				
		
		for (int i = 0; i < messek.length; i++) {
			if(messek[i].equals("0")) {
				messek[i] = "a";
			}else if(messek[i].equals("1")) {
				messek[i] = "b";
			}else if(messek[i].equals("2")) {
				messek[i] = "c";
			}else if(messek[i].equals("3")) {
				messek[i] = "d";
			}else if(messek[i].equals("4")) {
				messek[i] = "e";
			}else if(messek[i].equals("5")) {
				messek[i] = "f";
			}else if(messek[i].equals("6")) {
				messek[i] = "g";
			}else if(messek[i].equals("7")) {
				messek[i] = "h";
			}else if(messek[i].equals("8")) {
				messek[i] = "i";
			}else if(messek[i].equals("9")) {
				messek[i] = "j";
			}
		}
		return Arrays.stream(messek).map(String::valueOf).collect(Collectors.joining());
		// ��ģ ����� �ƽ�Ű �ڵ� ���� ���� �ͼ� ����ȯ �� 
		//  return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
		}
}
