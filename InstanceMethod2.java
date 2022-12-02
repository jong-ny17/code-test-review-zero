package javatu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javatu.InstanceMethod.newname;

public class InstanceMethod2 {
	
	private String name ;
	private int age;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "InstanceMethod2 [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		
		System.err.println(InstanceMethod.name("sss"));
		
		InstanceMethod ss = new InstanceMethod();
		InstanceMethod.NewName2 ww = ss.new NewName2();
		ww.printName2();
		
		
		String[] aaa = {"ss" , "dd" , "cc"};		
		for (String string : aaa) {
			System.err.println(string);
		}
		
		List<String> s = new ArrayList<String>();
		s.add("ssd");
		s.add("ddd");
		System.err.println(s);
		
		List<String> aa = Arrays.asList("as" , "ddd");		
		
	}

}
