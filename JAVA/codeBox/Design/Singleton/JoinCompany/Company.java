package kr.co.ezenac.singleton;

public class Company {

	private static Company instance = new Company(); // 클래스 내부에서 사용 가능한 변수

	private Company() {
	}

	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	public JoinCompany creatId() {
		JoinCompany newId = new JoinCompany();
		return newId;
		
	}
	

}
