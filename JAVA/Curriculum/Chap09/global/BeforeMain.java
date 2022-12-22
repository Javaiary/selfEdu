package kr.co.ezenac.global;

import java.util.Random;

public class BeforeMain {
	
	static int num; 		// 스태틱 멤버 변수
	
	static{					// 스태틱 초기화 블록
		Random random = new Random();
		num = random.nextInt(100);		// main() 실행 전, 0~99 사이 임의의 숫자 반환
	}
	public static void main(String[] args) {
		System.out.println(num);		// 자동 초기화값인 0이 아닌 random값 출력
	}

}
