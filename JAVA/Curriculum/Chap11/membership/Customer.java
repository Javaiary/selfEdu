package kr.co.ezenac.membership;

public class Customer {
	protected int customerId;			//회원 번호
	protected String customerName;	//회원 이름
	protected String customerGrade;	//회원 등급
	int bonusPoint;					//보너스 포인트
	double bonusRatio;				//보너스 적립율
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public Customer(int customerId, String customerName) {
		//super();
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 생성자 호출");
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
				bonusPoint + "입니다.";
	}
}
