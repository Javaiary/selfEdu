package kr.co.ezenac.constructor03;

public class Car {
	
	String color;
	String gearType;
	int door;
	public Car() {
	//초기화를 땅땅 하면, 새로 선언하기 전에는 초기화값이 디폴트값으로 나옴.
		//직접적으로 인스턴스 멤버변수를 초기화
//		this.color = "노랑";
//		this.gearType ="수동";
//		this.door = 4;
		
		this("검정", "수동", 2);
	}
/*
 * this
 * 	- 참조변수와 같은 역할
 *  - 멤버변수(파란색) 매개변수(갈색)을 구분짓는 데 사용
 *    (this를 사용하여 프로그램이 명확하게 실행되도록 함)
 */

	@Override
	public String toString() {
		return this.color + ", " +
				this.gearType + ", " +
				this.door;
	}
public Car(String color, String gearType, int door) {
	//super();
	this.color = color;
	this.gearType = gearType;
	this.door = door;
}
}
