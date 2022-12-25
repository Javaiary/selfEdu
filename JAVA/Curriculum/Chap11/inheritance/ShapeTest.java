package kr.co.ezenac.inheritance;

public class ShapeTest {
	public static void main(String[] args) {
		
		Circle circle = new Circle();	//부모생성자, 자기생성자 순으로 호출
		circle.draw();
		System.out.println();
		
		Circle circle2 = new Circle(new Point(150,150), 500);
		// Point 타입을 맞춰주기 위해서, new를 통해 객체를 생성해 준 후 좌표(Point) 설정
		circle2.draw();
		System.out.println();
		
		Triangle triangle = new Triangle(); //기본생성자: 초기화해준 디폴트 좌표가 들어감
		// new point *3 개 호출 / 부모생성자 호출/ 자기 생성자 호출
		triangle.draw();
		System.out.println();
		
/*
 * 	Triangle의 만든 두 번째 생성자를 호출해서 객체를 만들고 호출하시오.
 */
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 3);
		Triangle triangle2 = new Triangle(p1, p2, p3);
		triangle2.draw();
		System.out.println();
		
/*
 * 	Point[] 포인트 어레이를 사용하여 객체를 만들고 호출하시오.
 */
		Point[] pa = new Point[] {p1, p2, p3};
		Triangle triangle3 = new Triangle(pa);
		triangle3.draw();
	}
}
