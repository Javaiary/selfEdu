package kr.co.ezenac.innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	//메서드 내에 클래스 정의(지역local 클래스)
	Runnable getRunnable(int i) {	
		int num = 100;
		class MyRunnable implements Runnable{	//Runnable이 abstrct기 때문에 override 필수
			int localNum = 10;
			
			@Override
			public void run() {
				//i = 100;		//매개변수는 상수로 바뀜.
				//num = 200; 	//지역변수는 상수로 바뀜. final로 정의되어있어 값을 변경할 수 없음
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = "  + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스의 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스의 정적 변수)");
				
			} 
			
		}
		return new MyRunnable();
	}
}


public class LocalInnerClass {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
	}
	
}
