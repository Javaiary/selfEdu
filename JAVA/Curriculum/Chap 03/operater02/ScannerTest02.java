package rk.co.ezenac.operator02;

import java.util.Scanner;

public class ScannerTest02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수 한자리 입력: ");
//		int num = scan.nextInt();
//		System.out.println("사용자로부터 입력받은 숫자: " + num);
//		
//		System.out.print("실수 한자리 입력: ");
//		double dnum = scan.nextDouble();
//		System.out.println("사용자로부터 입력받은 숫자: " + dnum);
		
		System.out.print("문자열 입력: ");
		/*
		 * next(): 공백을 기준으로 해서 문자를 입력(단어 입력시 사용)
		 * nextLine(): 엔터키를 입력할 때까지 문자열을 입력(문장 입력시 사용)
		 */
		
//		String str = scan.next();
//		System.out.println("사용자로부터 입력받은 문자열 : " + str);
		
		String str2 = scan.nextLine();
		System.out.println("사용자로부터 입력받은 문자열 : " + str2);
		
		int result = 100;
		System.out.print("문자열을 입력(숫자) : ");			// print(): 다음 커서의 줄바꿈 없음. 
		String temp = scan.nextLine();
		int str3 = Integer.parseInt(temp);
			// Integer.parseInt() : 문자열로 입력받은 숫자들을 숫자로 바꿔주는 역할을 하는 메서드.
		
		int total = result + str3;
		System.out.println("연산 결과 : " + total);
		
		
		
		
		
		scan.close();
		
	}
}
