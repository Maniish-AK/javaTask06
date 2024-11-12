package javaTask06;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person myObj = new Person("James Bond", 35);
		System.out.println("Name :: " + myObj.getName());
		System.out.println("Age :: " + myObj.getAge());
		
	}

}
