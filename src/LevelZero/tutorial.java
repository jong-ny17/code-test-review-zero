package javatu;

public class tutorial {
	public static void main(String[] args) {

		System.err.println(add(1, 2));
		System.err.println(add(1, 2, 3));
		System.err.println(add(1, 2, 3, 4, 5));

		Person person = new Person();
		Person person2 = new Person("jong nyeong", 27);

		System.err.println(person.getAge());
		System.err.println(person.getName());
		System.err.println(person);
		System.err.println(person2);

		Hero hero = new Hero();
		System.err.println(hero);

	}

	public static int add(int x, int y) {

		return x + y;
	}

	public static int add(int x, int y, int z) {

		return x + y + z;
	}

	public static int add(int... numbers) {

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + i;
		}
		return sum;
	}

}

class Hero extends Person {

	private boolean isFlying;
	private String name2;

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}

	@Override
	public String toString() {
		return "Hero [isFlying=" + isFlying + ", name2=" + name2 + "]" + super.toString();
	}

}

class Person {

	private String name;
	private int age;

	Person() {

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
}
