package kr.co.ezenac.array02;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] score;//=null			//score 는 참조변수임.
//		score = {100, 200};		//배열이 생성되어있지 않은 상태로 값 대입.
		
		score = new int[5];	
		// 배열명 = 주소
		System.out.println("score의 주소값: " + score);
		
		for(int i = 0; i<score.length; i++) {
			System.out.println("score[" + i + "]= " + score[i]);
		}
		System.out.println();
		
		int[] arr1 = new int[10];
		for(int i = 0; i < arr1.length; i++) {
			//범위 1~10까지의 난수를 대입
			arr1[i] = (int)(Math.random()*10) + 1;
		}
		
		for(int i = 0; i <arr1.length;i++) {
			if(i != 9) {
				System.out.print(arr1[i] + ", " );
			}
			else {
				System.out.print(arr1[i]);
			}	
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
		
	}
}
