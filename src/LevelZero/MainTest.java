package LevelZero;

public class MainTest {
    public static void main(String[] args) {

        String[] a = {"m", "dot"};
        String[] b = {"n", "omg"};
        String[] c = {"a", "b", "c"} ;
        String[] d = {"com", "b", "d", "p", "c"};
        HowMuchSame how = new HowMuchSame();
        int first = how.solution(a , b);
        int second = how.solution(c , d);

        System.out.println("::::");
        System.out.println(first);
        System.out.println("::::");
        System.out.println(second);
    }
}
