package kr.co.ezenac.field02;

public class FieldInit /*extends Object*/ {
	// 멤버변수는 초기화 불필요 , 기본형 변수
	byte byteField;			//1byte
	short shortField;		//2
	int intField;			//4
	long longField;			//8
	
	boolean booleanField; 	//1
	char charField;			//2
	
	float floatField;		//4
	double doubleField;		//8
	
	//참조형 변수
	int[] arrField;			//4
	String strField;		//4
	
	/*
	 * 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때 혹은
	 * 원하는 포맷으로 멤버변수들을 출력하고자 할 때 사용
	 */
	@Override
	public String toString() {
		String str = "byteField: " + byteField +
					 ", shortField: " + shortField +
					 ", intField: " + intField +
					 ", longField: " + longField+
					 ", booleanField: " + booleanField+
					 ", charField: " + charField+
					 ", floatField: " + floatField+
					 ", doubleField: " + doubleField +
					 ", arrField: " + arrField +
					 ", strField: " + strField;
					 
		return str;
	}
}
