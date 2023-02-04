package kr.co.ezenac.lambda03;

import java.util.function.Function;

public class TestAdder {
	public static void main(String[] args) {	//add 에서 정의해놓은 adder를 이용하여 적용
		Function<Integer, Integer> myAdder = new Adder();
		int result = myAdder.apply(5);
		System.out.println(result);
	}
}
