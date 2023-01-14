package kr.co.ezenac.genericmethod;

public class GenericMethodTest {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		// 상위 클래스인 Number로 캐스팅해서 .doublevalue로 double타입으로 변경해줌
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();

		double width = right - left;
		double height = bottom - top;

		return width * height;
	}

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point(0, 0.0);
		Point<Integer, Double> p2 = new Point(10, 10.0);
		double rect = GenericMethodTest.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형 넓이는 " + rect + "입니다.");
		

	}
}
