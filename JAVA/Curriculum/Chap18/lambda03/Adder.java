package kr.co.ezenac.lambda03;

import java.util.function.Function;

public class Adder implements Function<Integer, Integer>{
	// function<T, R>을 구현함

	@Override
	public Integer apply(Integer x) {
		return x +10;
	}

}
