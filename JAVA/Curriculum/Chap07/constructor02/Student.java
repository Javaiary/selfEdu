package kr.co.ezenac.constructor02;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		System.out.println("기본 생성자 호출");
	}
	//매개변수가 있는 생성자(overloading)
	public Student(String name, int age) {
		//super();
		System.out.println("매개변수가 있는 생성자 호출");

		this.name = name;
		this.age = age;
	}

	//getter - private 변수에 접근할 수 있도록 해주는 통로
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return this.getName() + ", " + this.getAge();
	}
	public Student(String name) { //초기화 하는 것을 메서드화 하기 위해 생성자 사용
		System.out.println("매개변수가 String만 있는 생성자 호출");
	//super();
		this.name = name;	
	}
	public Student(int age) {
		System.out.println("매개변수가 int만 있는 생성자 호출");
		//super();
		this.age = age;
	}
	
	
}
