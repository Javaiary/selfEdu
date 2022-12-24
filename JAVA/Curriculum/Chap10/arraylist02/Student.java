package kr.co.ezenac.arraylist02;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentId;
	ArrayList<Book> booklist;

	public Student(String studentName) {
		// super();
		this.studentName = studentName;
		this.studentId = studentId;

		booklist = new ArrayList<>();
	}

	public void addBookList(String title) {
		Book book = new Book();

		book.setTitle(title);

		booklist.add(book);
	}

	//showInfo	: 향상된 for 문
	public void showInfo() {
		System.out.print(this.studentName + "학생이 읽은 책은 ");
		for (Book book : booklist) {
			System.out.print(book.getTitle() + ", ");
		}
		System.out.print("입니다.");
	}
	
	//showInfo2 : for if 문
	public void showInfo2() {	// index 선언 해준 후 arraylist.get(index).getter
		System.out.print(this.studentName + "학생이 읽은 책은 ");
		for (int i = 0; i < booklist.size(); i++) {
			if (i != booklist.size() - 1)
				System.out.print(booklist.get(i).getTitle() + ", ");
			else
				System.out.print(booklist.get(i).getTitle());
		}
		System.out.print("입니다.");
	}
	//showInfo3: 향상된 for if 문
	public void showInfo3() {
		System.out.print(this.studentName + "학생이 읽은 책은 ");
		int count = 0;
		for (Book book : booklist) {
			count++;
			if(booklist.size() == count)
			System.out.print(book.getTitle());
			else
				System.out.print(book.getTitle()+", ");
		}
		System.out.print("입니다.");
	}
}
