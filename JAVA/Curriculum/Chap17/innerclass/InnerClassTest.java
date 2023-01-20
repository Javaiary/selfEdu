package kr.co.ezenac.innerclass;

import kr.co.ezenac.innerclass.OutClass.InStaticClass;

class OutClass{
	private int num= 10;
	private static int sNum = 20;
	private InClass inClass;
	public OutClass() {
		inClass = new InClass();
	}
	class InClass {
		int inNum = 100;
//		static int sInNum = 200;	
		// static 선언 할 수 없음: static 메모리 영역은 메인이 실행되기 전에 먼저 실행 되는데
		//					   내부클래스는 외부클래스가 먼저 생성된 후에 생성되기 때문에 static변수를 사용할 수 없음
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass snum = " + sNum + "(외부 클래스의 클래스 변수)");
			System.out.println("InClasss inNum = " + inNum + "(내부 클래스의 인스턴수 변수)");
		}
//		static void sTest(){
//		}
	}
	public void usingInClass() {
		inClass.inTest();
	}
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		//정적 클래스의 일반메서드
		void inTest() { 
//			num+= 10;		// 외부 클래스의 인스턴스 변수는 사용 불가(외부클래스 생성 전이기 때문)
			System.out.println("InStaticClass inNum = " + inNum + "(정적내부클래스(본인클래스)의 인스턴스 변수사용 가능");
			System.out.println("InStaticClass sInNum = " + sInNum + "(정적내부클래스(본인클래스)의 스태틱 변수사용 가능");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용 가능)");
		}
		
		//정적 클래스의 static 메서드
		static void sTest() {
			//num += 10;		//외부 클래스의 인스턴스 변수 사용불가(스태틱-미리생성-이기 때문)
			//inNum += 10;		//내부 클래스의 인스턴스 변수 사용 불가
			
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용가능)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용 가능)");
		}
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInClass();
		//외부 클래스를 이용하여 내부클래스 메서드 호출
		System.out.println();
		
		//외부클래스(outClass 참조변수)를 이용하여 내부클래스 객체 생성
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		
		
		//static 클래스는 외부클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능(두가지 다 가능)
		System.out.println();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		InStaticClass sInClass2 = new InStaticClass();
		
		//정적 내부 클래스의 일반 메서드 호출
		sInClass.inTest();
		System.out.println();
		sInClass2.inTest();
		System.out.println();
		
		//정적 내부 클래스의 스태틱 메소드 호출
		OutClass.InStaticClass.sTest();
		System.out.println();
		sInClass.sTest();
		sInClass2.sTest();
		
		
	}
}
