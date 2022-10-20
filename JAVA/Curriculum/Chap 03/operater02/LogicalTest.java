package rk.co.ezenac.operator02;

public class LogicalTest {
	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (num1 > 1) && (num1 < 10);			// 참,거짓 논리곱
		System.out.println("1 초과 10 미만인가요? " + result);
		
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0 );	//참,거짓 논리합
		System.out.println("2 또는 3의 배수입니까? "+ result);
	}
}
