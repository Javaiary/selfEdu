package rk.co.ezenac.operator;

public class PrefixPostfixTest {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(++num);		//num값 하나 증가 후 출력
		System.out.println(num);
		
		
		System.out.println(num++); 		//출력 후 num 값 증가
		System.out.println(num);

		System.out.println("------------------------------");
		
		int x = 10;
		int y = 10;
		
		System.out.println("x = " + (x++));
		System.out.println("x = " + (x));
		
		System.out.println("y = " + (++y));
		System.out.println("y = " + (y));
	}

}
