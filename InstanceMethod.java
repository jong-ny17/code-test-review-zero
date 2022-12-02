package javatu;

public class InstanceMethod {
	
	
	public static String name(String a) {		
		return a+"222";
	}
	
	public static class newname{
		public static void printName() {
			System.err.println("name");
		}
	}
	
	public class NewName2{
		public void printName2() {
			System.err.println("name2");
		}
	}
	
	public static void main(String[] args) {
		InstanceMethod instance = new InstanceMethod();
		InstanceMethod.NewName2 aa = instance.new NewName2();
		aa.printName2();
		
		newname.printName();
				
	}
}
