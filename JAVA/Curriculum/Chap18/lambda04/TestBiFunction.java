package kr.co.ezenac.lambda04;

import java.util.function.BiFunction;

/*
 *  BiFunction Interface
 *  	- 매개변수가 두 개일 때 사용
 */
public class TestBiFunction {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
		int result = add.apply(3, 5);
		System.out.println(result);
	}

}
