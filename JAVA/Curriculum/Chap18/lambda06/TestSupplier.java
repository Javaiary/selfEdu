package kr.co.ezenac.lambda06;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<String> mySupplier = () -> "Hello EzenIt!"; //인풋이 없는 람다식 ()
		System.out.println(mySupplier.get());
		
		Supplier<Double> mSupplier1 = () -> Math.random();
		System.out.println(mSupplier1.get());
		
		System.out.println();
		printRandomDoubles(mSupplier1, 5);
	}
	
	// 1급 시민
	public static void printRandomDoubles(Supplier<Double> supplier, int count) {
		for(int i = 0; i < count ; i++) {
			System.out.println(supplier.get());
		}
	}
}
