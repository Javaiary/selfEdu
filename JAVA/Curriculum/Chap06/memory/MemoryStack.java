package kr.co.ezenac.memory;

public class MemoryStack {

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}	
	public static void main(String[] args) {
			int number1 = 10;
			int number2 = 20;
			int result = add(number1, number2) ;
			System.out.println("result ========" + result);
			
/*
 * main메서드 실행 상태에서 add프레임을 호출, (main 실행 중)
 * -> add프레임사라지고 다시 main 메서드로 복귀
 */
	}
}
