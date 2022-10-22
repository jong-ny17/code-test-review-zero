package LevelZero;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Overlap {
    class Solution {
        // Array 돌면서 Parameter n 이 몇개 들어 있는지 알수 있는 Logic 구현

        public int solution(int[] array, int n) {
            int answer = 0;
//            for (int i = 0; i < array.length; i++) {
//                if(array[i] == n) {
//                    answer ++ ;
//                }
//            }
//            return answer;
          return (int) Arrays.stream(array).filter(item -> item == n).count();
        }
    }
}
