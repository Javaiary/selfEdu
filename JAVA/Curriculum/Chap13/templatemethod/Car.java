package kr.co.ezenac.templatemethod;

public abstract class Car {
	final public void run() {		// 네 기능을 가지고 있는 run()이라는 템플릿 메서드
		startCar();					// final : 오버라이드를 하지 못하게 상속을 막음
		drive();
		stop();
		turnOff();
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public abstract void stop();

	public abstract void drive() ;

	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
}
