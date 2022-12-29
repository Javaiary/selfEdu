package kr.co.ezenac.interfacee;

public interface Calc {	//구현체가 아니기 때문에 객체를 생성할 수 없음
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
