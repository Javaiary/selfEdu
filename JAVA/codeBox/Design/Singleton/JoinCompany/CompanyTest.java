
package kr.co.ezenac.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1 + ", " + company2);
		
		
		//Object 클래스의 equals() : 주소비교
		if (company1.equals(company2)) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
			
		}
		// == 연산자 : 주소값(참조번지) 비교
		if(company1 == company2) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
//		====================================================
		
		Company cmpny = Company.getInstance();
		//Company의 인스턴스를 참조하는 Company cmpny 참조변수 생성
		
		
		JoinCompany company3 = cmpny.creatId();
		JoinCompany company4 = cmpny.creatId();
		// ★ cmpny 인스턴스를 통해 JoinCompany변수가 Company에 있는 creatId()에 접근 가능
		
		System.out.println(company3.getId());
		System.out.println(company4.getId());
		// company3의 타입이 JoinCompany이기 때문에 getId()호출 가능
		
		
		
	}
}
