package kr.co.ezenac.interfacee4;

public interface MyInterface {
	int MAX_NUM = 100;
	//일반적인 추상 메서드
	public void method();
	
	//override가 필수되지 않는 메서드(구현부를 가짐) 
	// but 용도에 맞게 override하여 사용 가능
	default void dMethod() {
		System.out.println("디폴트 메서드 호출");	
	}
	static void sMethod() {
		System.out.println("정적 메서드 호출");
	}
	//외부에서 보이지 않는 메서드
	private void pMethod() {
		System.out.println("private 메서드 호출");
	}
	private static void psMethod() {
		System.out.println("private static 메서드 호출");
	}

}
