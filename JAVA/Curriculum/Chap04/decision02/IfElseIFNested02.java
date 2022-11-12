package kr.co.ezenac.decision02;

import java.util.Scanner;

/*
 * 사용자로부터 성별, 나이, 신체등급 순으로 입력 받아서
 * 신체등급 1~3 : 현역
 * 신체등급 4 : 공익
 * 그외: 면제 가 출력되는 프로그램을 만드시오
 * 
 * 단, 성별을 입력받을 시에는 int로 입력받아 1이면 남자, 2면 여자로 판단한다.
 * 또한, 여자일 경우에는 추가적인 정보 입력 대신 "여성에게는 국방의 의무가 없습니다."가 출력되도록 만드시오.
 * 
 * 또한 남자이지만 미성년자일 경우 추가적인 정보 입력 대신
 * "미성년자에게는 아직 신체등급이 부여되지 않습니다." 가 출력되게 만드시오.
 */
public class IfElseIFNested02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성별이 남자면 1, 여자면 2를 입력하세요.");
		
		int gender= scan.nextInt();
		
		if(gender == 1) {
			System.out.print("나이를 입력하세요.");
			int age= scan.nextInt();
			if (age >= 19) {
				System.out.println("신체등급을 입력하세요.");
				int grade = scan.nextInt();
				if (grade < 4 ) {
					System.out.println("현역");
				}
				else if(grade == 4){
					System.out.println("공익");
				}
				else {
					System.out.println("면제");
				}
			}
			else {
				System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다.");
			}
		}
		else {
			System.out.println("여성에게는 국방의 의무가 없습니다.");
		}
			
	}
}

