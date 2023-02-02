package kr.co.ezenac.lambda02;

public class TestMyNumber {
	public static void main(String[] args) {
		// 우변의 람다식을 좌변의 (함수형인터페이스자료형)max변수에 대입
		MyNumber max = (x, y) -> (x > y)? x:y;
		MyNumber max2 = (x,y) ->{if (x>y) {
									return x;
								}
								else
									return y;};
								
		
		// 인터페이스 자료형 변수로 함수 호출
		System.out.println(max.getMax(3, 5));
		System.out.println(max2.getMax(3, 5));
	
	}
}
