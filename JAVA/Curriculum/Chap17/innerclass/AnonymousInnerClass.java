package kr.co.ezenac.innerclass;

class Outter {
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		//익명 내부 클래스
		// new 메서드 생성하여 리턴
		return new Runnable() {	 
			int localNum = 10;
			
			@Override
			public void run() {
				//i = 100;		//매개변수는 상수로 바뀜.
				//num = 200; 	//지역변수는 상수로 바뀜. final로 정의되어있어 값을 변경할 수 없음
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = "  + localNum);
				
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스의 정적 변수)");
				
			} 
			
		};
	}
	//객체를 바로 만듬(내부에서만 사용하고 버려질 객체)
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		out.runner.run();	
	}
}
