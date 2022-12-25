package kr.co.ezenac.membership;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer1 = new Customer(0, null);
		customer1.setCustomerName("이지연");
		customer1.setCustomerId(20220831);
		customer1.bonusPoint = 1000;
		System.out.println(customer1.showInfo());

		System.out.println();
		
		VIPCustomer customer2 = new VIPCustomer();
		//상속을 받았기 때문에 customer에서 생성된 setter사용가능
		customer2.setCustomerName("이송이");
		customer2.setCustomerId(20220901);		
		customer2.bonusPoint = 10000;
		System.out.println(customer2.showInfo());
		//부모 생성자 호출 -> 자식 생성자 호출 
	}
}
