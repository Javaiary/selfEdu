package kr.co.ezenac.interfacee6;

public class EzenClass implements EzenInterface{
	// EzenInterface가 2개의 인터페이스를 상속받았기 때문에 3가지 메서드를 재정의해주어야 함
	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
		
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
		
	}

}
