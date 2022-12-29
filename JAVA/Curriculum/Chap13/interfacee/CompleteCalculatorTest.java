package kr.co.ezenac.interfacee;

public class CompleteCalculatorTest {
	public static void main(String[] args) {
		Calc calc = new CompleteCalculator();
		int num1 = 10;
		int num2 = 2;
		
//		calc.showInfo();		// 업캐스팅 되었기 때문에 하위클래스의 메서드는 사용할 수 없음
		
		System.out.println(num1 + "+" + num2 + "=" +calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" +calc.substract(num1, num2));
		System.out.println(num1 + "*" + num2 + "=" +calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" +calc.divide(num1, num2));

	}
}
