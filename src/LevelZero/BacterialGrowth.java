package LevelZero;

public class BacterialGrowth {
//    어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
//    처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
    public int solution(int n, int t){

// 처음에 제곱근만 쓰면 되는건줄 알았는데 2배 씩 올라 가는거였음 잘못 생각했음 !
        
        return (int)Math.pow(2 , t) * n;
    }
}
