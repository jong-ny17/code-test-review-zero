package javatu;

public class tutorial2 {
public static void main(String[] args) {
	String str = "�ٳ��� : 1000��, ��� : 2000��, �� : 3000��";
	String target = "���";
	int target_num = str.indexOf(target);
	String result = str.substring(target_num,(str.substring(target_num).indexOf("��")+target_num));
	
	System.out.println(result+"��");
	
	
	
	
	
	Integer a = (1) ;
	int b = (Integer) 2;
	b = 23;
	int a2 = 2;
	a2 = 3;
	a = 3;
	int a3 = a + a2 ;
	System.err.println(a3);
	a = a2 + a3 ;
	System.err.println(a);
	Integer num = new Integer(17);
	Integer num2 = new Integer(17);
	
	System.out.println(num + "asd");
	int n = num.intValue();
	System.err.println(n);
	System.err.println(num == n);
	System.err.println(num == num2);
//	
//	String string = "sad";
//	
//	int strong = switch(string) {
//		
//	case "sad" : System.err.println("hello");
//	yield 1;	
//	
//	case "disagree" : System.err.println("asd");
//	yield 3;	
//	
//	default: 
//		System.err.println("OK");
//		yield 4;
//	};
//	
//	System.err.println(strong);

}

	

}
