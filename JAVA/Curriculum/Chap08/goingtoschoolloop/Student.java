package kr.co.ezenac.goingtoschoolloop;

public class Student {
	
	String studentName;
	int grade;
	int money;
	public Student(String studentName, int money) {
		//super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.ride(1250);
		this.money -= 1250;
	}
	
	public void takeSubway(Subway subway) {
		subway.ride(1300);
		this.money -= 1300;
	}
	public void showInfo() {
		System.out.println(studentName +"님의 남은 금액은 " + money + "원 입니다.");
	}
}
