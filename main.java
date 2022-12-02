package javatu;

public class main {
		public static void main(String[] args) {
			tt toto = new tt();
			int as = toto.ttmethod(1, 21);			
						
			
			tt.ttnameclass inner = toto.new ttnameclass();
			String a = inner.namemethod(" ^^ ");
			System.err.println(a);
			
			lengthOfArrayElement len = new lengthOfArrayElement();
			lengthOfArrayElement.Solution len_len = len.new Solution();
			String[] strlist = {"asdc" , "xaxs" , "xasas" , "xasa" };
			int[] aaa = len_len.solution(strlist);
			for (int i = 0; i < aaa.length; i++) {
				System.err.println(aaa[i]);
			}
		}

}
