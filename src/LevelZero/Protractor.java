package LevelZero;

public class Protractor {
        class Solution {
            // angle 의 값이 얼마인지에 따라 겂을 나타내는 -->
//            public int solution(int angle) {
//                int answer = 0;
//                if (0 < angle && angle < 90) {
//                    answer = 1;
//                } else if (angle == 90) {
//                    answer = 2;
//                } else if (90 < angle && angle < 180) {
//                    answer = 3;
//                } else if (angle == 180) {
//                    answer = 4;
//                }
//                return answer;
//            }
            public int solution(int angle) {
                return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
            }

        }
}
