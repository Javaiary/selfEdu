package kr.co.ezenac.lambda06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {

		// 받기만 한다?
		Consumer<String> myConsumer = (String str) -> System.out.println(str);
		myConsumer.accept("goodddddddd");
		myConsumer.accept("HiSeoul");

		// list 타입의 객체 return
		List<Integer> list = Arrays.asList(4, 2, 3);

		Consumer<Integer> myConsumer2 = x -> System.out.println("정수형 입력값 처리 :" + x);
		myConsumer2.accept(703);
		spend(list, myConsumer2);

		Consumer<Integer> myConsumer3 = x -> System.out.println("정수형 리스트 입력값 처리: " + x);
		spend(list, myConsumer3);

		List<Double> list2 = Arrays.asList(0.7, 0.0, 0.3);
		Consumer<Double> myConsumer4 = x -> System.out.println("더블형 입력값 처리 : " + x);
		spend(list2, myConsumer4);
	}

	public static <T> void spend(List<T> inputs, Consumer<T> consumer) {
		for (T input : inputs)
			consumer.accept(input); 
	}
}
