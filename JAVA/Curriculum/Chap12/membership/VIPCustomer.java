package kr.co.ezenac.membership;

public class VIPCustomer extends Customer {
	private int agentId;
	double salesRatio;	
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.agentId = agentId;
		salesRatio = 0.1;
//		this.bonusPoint = 10000;
		
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
	@Override
	public String showInfo() {
		return super.showInfo() + "\n 담당 상담원 번호는 " + agentId + "입니다.";
	}
		
	
	
}
