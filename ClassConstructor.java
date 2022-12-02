package javatu;

import java.lang.module.ModuleDescriptor.Builder;
import java.sql.Date;

// How to ues this
public class ClassConstructor {
	private String name ;
	private int age ;
	private String address;
	private Date date;
	
	public ClassConstructor(String name, int age, Date date, String address) {	
		this.name = name;
		this.age = age;
		this.address = address;
		this.date = date;
	}
	
	public ClassConstructor(String name , int age) {
		this(name , age , null , null);
	}
	
	public ClassConstructor getConstructor() {
		return this;
	}
		
	public static class Builder{
		private String name;
		private int age;
		private String address;
		private Date date;
		
		
		public Builder name(String val) {
			name = val;
			return this;
		}
		
		public Builder age(int val) {
			age = val;
			return this;
		}
		
		public Builder address(String val) {
			address = val;
			return this;
		}
		
		public Builder date(Date val) {
			date = val;
			return this;
		}
		
		public ClassConstructor build() {
			return new ClassConstructor(this);
		}
	}
	private ClassConstructor (Builder builder) {
		name = builder.name;
		age = builder.age;
		address = builder.address;
		date = builder.date;
		
	}
		
	
	public static void main(String[] args) {
		ClassConstructor.Builder builder = new ClassConstructor.Builder().name("").age(1).date(null).address("asdsadasd");
		ClassConstructor cocal = builder.build();
		System.err.println(cocal.address);
	}
}
