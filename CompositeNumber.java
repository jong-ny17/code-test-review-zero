package javatu;

public class CompositeNumber {
	// ����� ������ �� �� �̻��� ���� �ռ������ �մϴ�. �ڿ��� n�� �Ű������� �־��� �� n������ �ռ����� ������ return�ϵ���
	// solution �Լ��� �ϼ����ּ���.
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
	        // �������� ��Ʈ���� ���Ƽ� �ڵ�� ��������� �ð� ���⵵ �κп��� �ʹ� ������ 
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
