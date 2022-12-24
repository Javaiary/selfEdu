package kr.co.ezenac.array05;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>(); // <>: 변수 안에 들어가는 요소(객체 배열)

		library.add(new Book("예, 아니오", "이송이"));
		library.add(new Book("혼공", "강민철"));
		library.add(new Book("혼공3", "강민철3"));
		library.add(new Book("혼공4", "강민철4"));
		library.add(new Book("혼공5", "강민철5"));

		for (int i = 0; i < library.size(); i++) { //size(): 배열에 추가된 전체 개수 반환
			library.get(i).showInfo();			   //get(): 배열의 index 위치에 있는 요소 값을 반환
		
		}
	}
}
