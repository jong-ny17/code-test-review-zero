package javatu;

public class TwoDimensional {
	// 배열을 n으로 나눠서 넣어주는 식을 표현하시오 
	  public int[][] solution(int[] num_list, int n) {
		  int a = 0;
	         int[][] answer = new int[num_list.length/n][n];
	        for (int i = 0; i < num_list.length/n; i++) {
				for (int j = 0; j < n; j++) {
					answer[i][j] = num_list[a];
					a++;
				}
			}
	        return answer;
	        
	        // int length = num_list.length;

	        // answer = new int[length/n][n];

	        // for(int i=0; i<length; i++){
	        //    ***** answer[i/n][i%n]=num_list[i]; *****  미친 
	        // }

	        // return answer;
	    }
}
