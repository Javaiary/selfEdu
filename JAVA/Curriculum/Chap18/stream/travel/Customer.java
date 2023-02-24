package kr.co.ezenac.stream.travel;
/*
 * 여행사에 패키지여행 상품이 있습니다.
 * 여행 비용: 15세이상-100만원, 15세미만-50만원
 * 고객 3명이 패키지여행상품을 구매합니다.
 * 비용 계산과 고객 검색에 대한 연산을 스트림을 활용하여 구현하시오.
 */
public class Customer {
	private String name;
	private int age;
	private int price;
	public Customer(String name, int age, int price) {
//		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
}
