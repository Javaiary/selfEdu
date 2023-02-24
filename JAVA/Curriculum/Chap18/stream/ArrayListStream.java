package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		
		sList.add("ValKilmer");
		sList.add("JonHamm");
		sList.add("Tom");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		// 정렬되었지만 별도의 메모리공간에서 수행되기 때문에 원본 데이터에는 영향이 없음
		System.out.println();

		sList.stream().map(s-> s.length()).forEach(n-> System.out.print(n + "\t"));
		// 렝스는 원본 기준의 순서대로 출력됨
		System.out.println();
		
		sList.stream().filter(s -> s.length() >=5).forEach(n -> System.out.print(n + "\t"));
		//조건 (filter())에 맞는 자료를 원본의 순서대로 출력
		
	}
}
