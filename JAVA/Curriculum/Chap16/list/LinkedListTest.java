package kr.co.ezenac.list;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D");
		System.out.println(myList); 	//대체되는 것이 아니고 1번째에 끼어들어감
		
		myList.remove();
		System.out.println(myList);		//가장 앞 인덱스(0)번 삭제
	}
}
