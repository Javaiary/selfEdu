package kr.co.ezenac.membership02;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer1 = new Customer(0, null);
		customer1.setCustomerName("이순신");
		customer1.setCustomerId(20220831);
		customer1.bonusPoint = 1000;
		System.out.println(customer1.showInfo());

		System.out.println();
		
		
		//VIP 
		VIPCustomer customer2 = new VIPCustomer(20220901, "신사임당");
		//상속을 받았기 때문에 customer에서 생성된 setter사용가능
//		customer2.setCustomerName("신사임당");
//		customer2.setCustomerId(20220901);		
		customer2.bonusPoint = 10000;
		System.out.println(customer2.showInfo());
		//부모 생성자 호출 -> 자식 생성자 호출 
		
		System.out.println();
		Customer customer3 = new VIPCustomer(20220902, "이방원");
		// 상위 클래스로 자동 형변환(upcasting)
		// customer3는 Customer클래스의 멤버변수와 메서드만 사용가능
		customer3.bonusPoint = 10000;
		System.out.println(customer3.showInfo());
	}
}
