package javatu;

public class Factorial {
	   public static int solution(int n) {
	        int answer = 0;
	        
	        for (int i = 0; i <= 10; i++) {
	        	System.err.println("ÃÖÃÊ :" + i);
				if(factorial(i) <= n) {
					
					answer = i;
				}
			}
	        return answer;
	    }
	   
	   public static int factorial(int a) {
		   if(a <= 1) {
			   return 1 ;
		   }else {
			   return a * factorial(a -1);
		   }
		   
	   }
	   
	   public static void main(String[] args) {
		   System.err.println(factorial(3));
	   }

}
