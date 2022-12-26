package kr.co.ezenac.membership;

import java.util.ArrayList;

public class CustomerTest2 {
	
	public static void main(String[] args) {
		
//		Customer customer1 = new Customer(2022, "Val");
//		customer1.bonusPoint = 1000;
//		
//		int price1 = customer1.calPrice(10000);
//		System.out.println(customer1.showInfo() + "지불금액은 " + price1 + "원입니다. ");
//		// 적립금 적립(1%) + 원가
//		
//		System.out.println();
//		Customer customer2 = new VIPCustomer(2023, "Tom", 0003);
//		customer2.bonusPoint = 10000;
//		
//		int price2 = customer2.calPrice(10000);
//		System.out.println(customer2.showInfo() + "지불금액은 " + price2 + "원입니다. ");
//		// 적립금 적립(5%) + 10% 할인	
//		
//		System.out.println();
//		Customer customer3 = new GoldCustomer(2024, "Jon");
//		customer3.bonusPoint = 5000;
//		
//		int price3 = customer3.calPrice(10000);
//		System.out.println(customer3.showInfo() + "지불금액은 " + price3 + "원입니다. ");
//		// 적립금 적립(2%) + 10%할인	

		
		ArrayList<Customer> customerlist = new ArrayList<>();
		
		Customer customer1 = new Customer(202208, "이순신");
		Customer customer2 = new Customer(202209, "신사임당");
		Customer customer3 = new GoldCustomer(202210, "최영");
		Customer customer4 = new GoldCustomer(202210, "이성계");
		Customer customer5 = new VIPCustomer(202212, "김유신", 77777);
		//Upcasting 된 상태
		//자식 메서드를 사용하고 싶으면 원래 급으로 변경(다운캐스팅; 강제 형변환)

		
		customerlist.add(customer1);
		customerlist.add(customer2);
		customerlist.add(customer3);
		customerlist.add(customer4);
		customerlist.add(customer5);


		System.out.println("==========고객 정보 출력=========");
		for(Customer customer: customerlist) {
			System.out.println(customer.showInfo());
		}
		System.out.println("==========할인율 계산=========");
		int price = 10000;
		for(Customer customer : customerlist) {
			int cost = customer.calPrice(price);
			System.out.println(customer.getCustomerName()+ "님이 지불하실 금액은 " +cost + "원 지불하셨습니다.");
		}
		System.out.println("=====보너스 포인트 계산=====");
		int bonusPoint;
		for(Customer customer: customerlist) {
			System.out.print(customer.getCustomerName()+ "님의 보너스 포인트는 "); 
			if (customer.customerGrade == "VIP") {
				bonusPoint = 10000;
			}
			else if (customer.customerGrade == "GOLD") {
				bonusPoint = 5000;
			}
			else {
				bonusPoint = 1000;
			}
			System.out.println(bonusPoint+customer.bonusPoint + "점입니다.");
		}
	}
}
