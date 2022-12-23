package kr.co.ezenac.array04;

import kr.co.ezenac.array02.Book;
		// 깊은 복사 해보기
public class ObjectCopy {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("혼자공부하는 컴퓨터구조", "이순신");
		library[1] = new Book("혼자공부하는 컴퓨터구조2", "이순신2");
		library[2] = new Book("혼자공부하는 컴퓨터구조3", "이순신3");
		library[3] = new Book("혼자공부하는 컴퓨터구조4", "이순신4");
		library[4] = new Book("혼자공부하는 컴퓨터구조5", "이순신5");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();	//현재 null 값
		
		for ( int i = 0; i < library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}

		library[0].setTitle("구글맨");
		library[0].setAuthor("빌");
		System.out.println();
		
		for(Book book : library)
			book.showInfo();
		
		//원본의 데이터를 변경한 후 복사본을 재출력 확인
		for(Book book : copyLibrary) 
			book.showInfo();		// 복사본에 직접 데이터를 카피해 넣었기 때문에 변동 X(깊은 복사)
	}

}
