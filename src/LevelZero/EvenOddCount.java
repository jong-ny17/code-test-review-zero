package LevelZero;

public class EvenOddCount {
    public int[] solution(int[] num_list) {
        // 배열에 안에 있는 element 홀수 짝수 갯수로 추려서 배열에 저장해서 리턴
        // 나
//        int even = 0;
//        int odd = 0;
//        for (int i = 0; i < num_list.length; i++) {
//            if (num_list[i] % 2 != 0) {
//                odd++;
//            } else {
//                even++;
//            }
//        }
//        int[] answer = {even , odd};
//        return answer;

        // 다른 사람
        // 홀수 짝수 담을 배열 생성
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            answer[num_list[i] % 2]++;
        }
        // 처음에는 이해를 못했는데 애초에 answer[ 안에서 나머지 값이 0 , 1 두개의 값으로 나오기 때문에 조건이 더 많지 않은 문제 이기 때문에
        // 나머지 값이 여기서 배열 1 번  , 2 번으로 1씩 추가 ++
        return answer;
    }
}
