package LevelZero;

public class LambSkewers {
    //    머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
//    정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
    class Solution {
        public int solution(int n, int k) {
            int beverage = 2000 ;
            int lamb = 12000 ;
            if (n >= 10){
                k =  k - n/10;
                if(k < 0){
                    k = 0;
                }
            }
            int answer = (lamb*n) + (beverage*k);
            return answer;
        }
    }

    // 정답 : 일단 맞았는데 다른 사람들 풀이 한거를 보니까 그냥 세일을 해주는걸로 2000원을 빼는 식을 만들었는데 양꼬치만 12개를 먹고 음료수를 안먹었다고 가정하면
    // 2000원을 빼는 식으로 코드가 실행 되는데 저게 맞는건가

}
