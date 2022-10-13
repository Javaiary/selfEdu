package kr.co.ezneac.variable03;
 /*
  * 1. 자료형 변환이 필요한 이유
  * 	- 피연산자의 자료형이 일치해야 동일한 방법을 적용하여 연산을 진행할 수 있음.
  * 	- 피연산자의 자료형이 일치하지 않을 때 형(Type)의 변환을 통해 일치를 시켜야 함.
  * 2. 종류
  * 	- 자동 형변환(Implicit Conversion)
  * 		- 규칙 1) 자료형의 크기가 큰 방향으로 형변환이 이루어짐.
  * 		- 규칙 2) 자료형의 크기에 상관없이 정수 자료형보다 실수 자료형이 우선함. 
  */
public class VarTest2 {
	public static void main(String[] args) {
		/*
		 * 문자값을 정수타입으로 바꾸게 되면, 
		 * 아스키코드 값으로 바뀌어서 출력이 됨.
		 */
		char ch = 'a';
		int i = ch; 
		
		System.out.println("문자 -> 정수: " + i);

		//any 타입 + "문자열" ==>전부 문자열 타입으로 캐스팅이 됨 
		int i2 = 100;
		String str = "java" + i2 ;
		System.out.println(str);
		
		double num1 = 30;
		System.out.println(59L + 34.5);

	}
}
