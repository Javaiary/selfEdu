package rk.co.ezenac.constant;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;	//선언과 동시에 초기화
		final int MIN_NUM;			//선언만 하기
		MIN_NUM = 60;				//나중에 초기화, 딱 한 번 가능
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// MAX_NUM = 10; // error 이미 정의된 상수는 변경할 수 없음. 

		int myScore = 50;
		if (myScore < MIN_NUM) {
			System.out.println("당신의 학점 등급은 F입니다.");
		}
		
	
	}

}
