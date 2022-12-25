package kr.co.ezenac.membership02;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;
	
//	public VIPCustomer() {		//VIPCustomer() 호출시 초기화해 줄 값
//		super(2022, "SILVER");
//		this.customerGrade = "VIP";
//		this.bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//
//	}	
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");

		
	}
	public int getAgentId() {
		return agentId;
	}
		
	@Override // 재정의(변수는 그대로, body를 변경)
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
		
	
	
}
