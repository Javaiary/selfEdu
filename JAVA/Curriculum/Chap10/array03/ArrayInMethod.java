package kr.co.ezenac.array03;

public class ArrayInMethod {
	public static void main(String[] args) {
		int[] arr = makeIntArray(5);
		int sum1 = sumOfArray(arr);
		System.out.println(sum1);
		
	}
	public static int[] makeIntArray(int len) { //mIA라는 int배열 생성자 정의(퍼블릭, 스태틱)
		int[] arr = new int[len];
		for(int i = 0; i<len; i++)
			arr[i] = i;
		
		return arr;
		
	}
	
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i= 0; i <arr.length; i++) {
			sum += arr[i];	//누적
		}
		return sum;
	}
}
