package rk.co.ezenac.operator02;

import java.util.Scanner; //java.lang 이외의 패키지들으 import를 통해 표기해주어야 함.

public class ScannerTest {
	public static void main(String[] args) {
		/*
		 * Scanner 클래스: 입력을 받기 위한 클래스
		 * 사용하고나서 반드시 닫아줘야 함(메모리 사용).
		 */
		Scanner scan = new Scanner(System.in);	//스캐너 클래스를 사용하기 위해 새 클래스를 만듬.
		
		System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요.");
		
		//입력 대기
		
		// 입력이 끝나고 엔터 값이 들어오면 변수에 저장함. 
		/*
		 * 여러 숫자가 입력되면 일단 버퍼(buffer)에 내용을 넣고 스페이스(공백)이나 탭으로 구분하여
		 * 하나씩 입력된 데이터를 변수에 대입하게 됨.
		 */
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		System.out.println("숫자를 1 입력하고 엔터를 입력하세요.");
		int num4 = scan.nextInt();
		System.out.println("숫자를 2 입력하고 엔터를 입력하세요.");
		int num5 = scan.nextInt();
		System.out.println("숫자를 3 입력하고 엔터를 입력하세요.");
		int num6 = scan.nextInt();			

		System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
		
		
		
		scan.close();
	}
}
