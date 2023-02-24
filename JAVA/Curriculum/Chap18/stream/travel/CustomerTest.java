package kr.co.ezenac.stream.travel;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("Val", 30, 100);
		Customer c2 = new Customer("Tom",20, 100);
		Customer c3 = new Customer("Jon", 13, 50);
		
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		
		System.out.println("===고객 명단 추가된 순서대로 출력===");
		customerList.stream()
				.map(c-> c.getName()).forEach(s ->System.out.println(s));
		
		
		int total = customerList.stream()
				.mapToInt(c-> c.getPrice()).sum();
		System.out.println("총 여행 비용은 " + total + "만원 입니다.");
		
		
		System.out.println("===20세 이상의 고객 명단 정렬하여 출력===");
		customerList.stream()
				.filter(c-> c.getAge() >=20).map(c->c.getName())
				.forEach(s-> System.out.println(s));
		
	}
}
