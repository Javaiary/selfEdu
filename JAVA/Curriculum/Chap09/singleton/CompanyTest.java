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

	}
}