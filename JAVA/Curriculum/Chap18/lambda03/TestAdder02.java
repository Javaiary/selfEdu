package kr.co.ezenac.lambda03;

import java.util.function.Function;

public class TestAdder02 {			//implements없이 function 타입 함수를 새로 생성
	public static void main(String[] args) {
		Function<Integer, Integer> myAdder = x -> x+15;
		
		System.out.println(myAdder.apply(20));
		
	}
}
