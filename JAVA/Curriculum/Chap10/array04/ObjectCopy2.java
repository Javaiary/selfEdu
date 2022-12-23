package kr.co.ezenac.array04;

import kr.co.ezenac.array02.Book;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("혼자공부하는 컴퓨터구조", "이순신");
		library[1] = new Book("혼자공부하는 컴퓨터구조2", "이순신2");
		library[2] = new Book("혼자공부하는 컴퓨터구조3", "이순신3");
		library[3] = new Book("혼자공부하는 컴퓨터구조4", "이순신4");
		library[4] = new Book("혼자공부하는 컴퓨터구조5", "이순신5");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		//향상된 for문 활용해서 출력(length만큼 알아서 반복)
		for(Book book : copyLibrary) 	//copyLibrary에 있는 데이터 타입과 변수 
			book.showInfo();
		
		library[0].setTitle("구글맨");
		library[0].setAuthor("빌");
		System.out.println();
		
		for(Book book : library)
			book.showInfo();
		
		//원본의 데이터를 변경한 후 복사본을 재출력 확인
		for(Book book : copyLibrary) 
			book.showInfo();		// 복사본도 함께 데이터 변경됨(연동=주소 번지만 복사(얕은 복사))
	}

}
