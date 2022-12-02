package javatu;

public class CompositeNumber {
	// 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록
	// solution 함수를 완성해주세요.
	   public static int solution(int n) {
		   int count = 0;
	        for (int i = 0; i < n+1; i++) {	
	        	System.err.println(composite(i));
				if(composite(i)) {					
					count++;
				}
			}
	        return count;	     
	        
	        // return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
	        // 이중으로 스트림을 돌아서 코드는 깔끔하지만 시간 복잡도 부분에서 너무 떨어짐 
	    }
	   
	  static boolean composite(int number) {		  		  
		  int N = number;
		  int count = 0;
		  for (int i = 1; i * i <= N; i++) {
		  	if (i * i == N) count++;
		  	else if (N % i == 0) count += 2;
		  }
		  if(count >= 3) {
			  return true;
		  }
		  return false;		  
	  }	 	 
}
