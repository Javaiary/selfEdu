package kr.co.ezenac.membership;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		salesRatio = 0.1;
//		this.bonusPoint = 5000;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");

	}
	
	@Override
	public int calPrice(int 
			price) {
		bonusPoint += price * bonusRatio;
		return (int)(price - price * salesRatio);
	}
}
