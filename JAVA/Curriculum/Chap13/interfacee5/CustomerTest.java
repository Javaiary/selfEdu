package kr.co.ezenac.interfacee5;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		// Customer 기준이므로 모든 메서드 사용 가능
		customer.buy();
		customer.sell();
		customer.sayWorld();
		customer.order();

		Buy buyer = customer; // buyer 와 customer가 같은 주소를 가리킴
		// Buy 기준이므로 buy()메서드만 이용 가능
		buyer.buy();

		Sell seller = customer;// seller 와 customer가 같은 주소를 가리킴
		// Sell 기준이므로 sell()메서드만 이용 가능
		seller.sell();
		
		buyer.order();
		seller.order();
	}
}
