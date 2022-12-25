package kr.co.ezenac.inheritance;

public class Circle extends Shape{	//Shape를 상속. Shape가 가지고 있는 인자를 사용 가능!!
	
	Point center;			//원점
	int radius;				//반지름
	
	public Circle() {
		this(new Point(0,0), 100);	//원점이 0,0이고 반지름이 100인 원 생성
	}
	public Circle(Point center, int radius) {
		//super();		// 부모 클래스를 호출해주는 생성자 생략 (컴파일러에서 자동 생성)
		System.out.println("Circle클래스의 매개변수가 있는 생성자 호출");
		this.center = center;
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("색깔 : " + this.color); //Shape의 color
		System.out.println("원점 : (x : " + this.center.x + ", y: " +this.center.y + ") \n반지름: "+
							this.radius);
	}
}
