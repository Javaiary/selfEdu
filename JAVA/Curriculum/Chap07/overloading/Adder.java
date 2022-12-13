package kr.co.ezenac.overloading;

public class Adder {
	//add() 메서드명으로 오버로딩함
	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		return x+y;
	}
//	public int add(int a, int b) {
//		return a+b;
//	}									//변수 이름이 다른 것 (오버로딩 X)
//	public long add(int x, int y) {
//		return x+y;
//	}									//return Type이 다른 것 (오버로딩 X)

	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x+y;
	}
	public double add(double x, double y) {
		System.out.println("add(double x, double y)");
		return x+y;
	}
}
