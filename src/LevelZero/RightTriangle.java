package javatu;
import java.util.Scanner;


// "*"�� ���̿� �ʺ� 1�̶�� ���� ��, "*"�� �̿��� ���� �̵ �ﰢ���� �׸������մϴ�. ���� n �� �־����� ���̿� �ʺ� n �� ���� �̵ �ﰢ���� ����ϵ��� �ڵ带 �ۼ��غ�����.
public class RightTriangle {
	public class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        for (int i = 1; i < n+1; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	        
	        for(int i=1; i<=n; i++){
	            System.out.println("*".repeat(i));
	        }
	     
	    }

	}
}
