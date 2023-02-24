package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStream {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4 };
		
		Arrays.stream(arr).forEach(n -> System.out.print(n+ "\t"));
		//forEach() : stream 내 데이터를 각각 다음 처리()를 해줌 
		System.out.println();
		
		int sum =Arrays.stream(arr).sum();
		System.out.println("sum : " + sum);
		
		List<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum2);
	}
}
