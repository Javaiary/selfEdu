package kr.co.ezenac.lambda06;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class TestBiConsumer {
	public static void main(String[] args) {
		List<Double> list = Arrays.asList(7.0, 0.0, 0.3);
		BiConsumer<Integer, Double> biConsumer = (index, input) -> 
		System.out.println("두 개 입력값 처리: "+index + " = " + input);
		
		spend(list, biConsumer);
	}

	public static <T> void spend(List<T> inputs, BiConsumer<Integer, T> biConsumer) {
		for (int i = 0; i < inputs.size(); i++)

			biConsumer.accept(i, inputs.get(i));
	}
}
