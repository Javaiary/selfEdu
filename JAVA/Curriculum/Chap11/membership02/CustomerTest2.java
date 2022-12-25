package kr.co.ezenac.membership02;

public class CustomerTest2 {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(2022, "Val");
		customer1.bonusPoint = 1000;
		
		int price1 = customer1.calPrice(10000);
		System.out.println(customer1.showInfo() + "지불금액은 " + price1 + "원입니다. ");
		// 적립금 적립(0.01%) + 원가
		
		System.out.println();
		Customer customer2 = new VIPCustomer(2023, "Tom");
		customer2.bonusPoint = 10000;
		
		int price2 = customer2.calPrice(10000);
		System.out.println(customer2.showInfo() + "지불금액은 " + price2 + "원입니다. ");
		// 적립금 적립(0.05%) + 할인	
	}
}
