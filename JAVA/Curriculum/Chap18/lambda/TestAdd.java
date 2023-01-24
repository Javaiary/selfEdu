package kr.co.ezenac.lambda;

public class TestAdd {
	public static void main(String[] args) {
		
//		Add addF = (int x, int y) -> {return x + y;};
		// 람다식으로 표시한 add함수
		
		Add addF = (x,y) -> x+y;
		
		System.out.println(addF.add(3, 5));
	}
}
