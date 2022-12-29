package kr.co.ezenac.abstractclass;

public abstract class Computer {
	abstract void display();	//body가 없는 메서드
	abstract void typing();		//body가 없는 메서드2
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
