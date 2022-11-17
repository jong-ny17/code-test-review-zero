package javatu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CaseConversion {
    public String solution(String my_string) {
        String answer = "";
        return Arrays.stream(my_string.split("")).map(item ->
        Character.isUpperCase(item.charAt(0)) ? item.toLowerCase() : Character.isLowerCase(item.charAt(0)) ? item.toUpperCase() : item ).collect(Collectors.joining());        
    }
}
