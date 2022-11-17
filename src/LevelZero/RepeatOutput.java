package javatu;

import java.util.ArrayList;
import java.util.List;

public class RepeatOutput {
	public String solution(String my_string, int n) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < my_string.length(); i++) {
			String a = my_string.substring(i, i + 1);
			for (int j = 0; j < n; j++) {
				list.add(a);
			}
		}

		return String.join("", list);
	}
	// function solution(my_string, n) {
	// var result = "";
	// for (let i = 0; i < my_string.length; i++) {
	// result += my_string.charAt(i).repeat(n);
	// }
	// return result;
	// }
}
