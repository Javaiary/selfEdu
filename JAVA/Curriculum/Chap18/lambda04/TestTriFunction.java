package kr.co.ezenac.lambda04;

public class TestTriFunction {
	
	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> addTri = 
														(x, y, z) -> x+y+z;
		int result = addTri.apply(1, 2, 3);
		System.out.println(result);
		
		
	}

	
}
