package kr.co.ezenac.field02;

public class FieldInitTest {
	public static void main(String[] args) {
		/*
		 * new 연산자
		 * - 클래스에 있는 멤버들의 byte크기만큼 
		 * 	 heap에 메모리할당을 하며 동시에 초기화를 시켜주는 역할을 함
		 */
		FieldInit fieldInit = new FieldInit();
		System.out.println(fieldInit.byteField);
		System.out.println(fieldInit.booleanField);
		System.out.println(fieldInit.floatField);

		System.out.println(fieldInit.toString());
	}
}
