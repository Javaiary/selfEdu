package kr.co.ezenac.array02;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		
		book[0] = new Book("혼자공부하는 컴퓨터구조", "이순신");
		book[1] = new Book("혼자공부하는 컴퓨터구조2", "이순신2");
		book[2] = new Book("혼자공부하는 컴퓨터구조3", "이순신3");
		book[3] = new Book("혼자공부하는 컴퓨터구조4", "이순신4");
		book[4] = new Book("혼자공부하는 컴퓨터구조5", "이순신5");
		
		for(int i = 0; i <book.length; i++) {
			//System.out.println(book[i]);
			book[i].showInfo();
		}
				
	}

}
