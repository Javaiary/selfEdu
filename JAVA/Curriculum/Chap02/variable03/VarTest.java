package kr.co.ezneac.variable03;

public class VarTest {

	public static void main(String[] args) {
		byte b1 = 127;
		//byte b2 =  b1+ 2;		// 오버플로우 (=129)
		byte b2 = (byte)(b1+ 2);	// 강제캐스팅(형 변환)
		System.out.println(b1);
		System.out.println("강제캐스팅 후: " + b2); // 127 > -128 > -127
		
		int i1 = b1;				// 자동캐스팅(형변환 코드 생략 가능)- 데이터 손실 없음
		System.out.println("자동캐스팅 후: " + i1);
		
		//정수와 실수간의 캐스팅
		/*
		 * => 저장하는 방식이 다르기 때문에 반드시 데이터 손실이 발생
		 * 	  아울러 명시적 캐스팅 코드가 들어가야 함.
		 */
		
		int i3 = 100;
		float f1 = i3;		// 캐스팅 생략 가능
		
		System.out.println("정수 -> 실수 : " + f1);
		
		float f2 = 10.55f;
		int i4 = (int)f2;
		System.out.println("실수 -> 정수 : " + i4);

	}

}
