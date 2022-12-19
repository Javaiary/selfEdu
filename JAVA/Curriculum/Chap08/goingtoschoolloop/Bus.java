package kr.co.ezenac.goingtoschoolloop;

public class Bus {
	
	int busNumber; 
	int passengerCount;
	int money;
	public Bus(int busNumber) {
		super();
		this.busNumber = busNumber;
	}
	// 승차하다
	public void ride(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(busNumber +"번 버스의 승객은 " + passengerCount 
				+ "이고, 수입은 " + money + "원 입니다.");
	}
}
