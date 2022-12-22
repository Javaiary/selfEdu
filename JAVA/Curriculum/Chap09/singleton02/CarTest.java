package kr.co.ezenac.singleton02;

public class CarTest {
	
	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance(); 
		//CarFactory의 인스턴스를 참조하는 카팩 carFactory 참조변수생성
				
		Car car1 = carFactory.createCar(); 
		Car car2 = carFactory.createCar();
		//carFactory 인스턴스를 통해 Car타입 변수가 CarFactory에 있는 creatCar()에 접근 가능
		
		
		System.out.println("car1 : " + car1.getCarNum());
		System.out.println("car2 : " + car2.getCarNum());
		
	}
}
