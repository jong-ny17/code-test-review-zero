package LevelZero;

public class DivisionOfTwoNumbers {

    public int solution(int num1, int num2) {

        float division = (float) num1 / num2;
        int answer = (int) (division*1000);
        return answer;
    }
}
