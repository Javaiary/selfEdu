package kr.co.ezenac.array;

public class IntArrayTest {
	public static void main(String[] args) {
		// 길이가 3인 int형 1차원 배열 생성
		int[] arr1 = new int[3];
		arr1[0] = 100;		// 첫 번째 요소
		arr1[1] = 90;		// 두 번째
		arr1[2] = 80;		// 세 번째
		
		int sum = arr1[0] + arr1[1] + arr1[2];	// 값의 참조
		System.out.println("총점 : " + sum);
		
		int[] arr2 = new int[10];
		int total = 0;
		
		for( int i = 0, num = 1; i < arr2.length; i++, num++) {
			arr2[i] = num;
		}
		for(int i =0 ; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			total += arr2[i];
		}
		System.out.println(total);
		
	}
}
