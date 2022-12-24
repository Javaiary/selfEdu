package kr.co.ezenac.arraylist02;
/*
 * Ezen 학원에 학생이 3명 있습니다.
 * 각 학생마다 읽은 책을 기록하고 있습니다.
 * 학생마다 읽은 책을 Student 클래스 내에 ArrayList를 생성하여 관리하도록 합니다.
 * 다음과 같이 출력되게 클래스를 만들어서 실행하시오.
 * 
 * Lee 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다.
 * Val 학생이 읽은 책은 : 딥러닝1, 딥러닝2, 딥러닝3 입니다.
 * Jon 학생이 읽은 책은 : 머신러닝1, 머신러닝2, 머신러닝3, 머신러닝4, 머신러닝5, 머신러닝6 입니다.
 */
public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("Lee");
		student1.addBookList("운영체제1");
		student1.addBookList("운영체제2");
		
		Student student2 = new Student("Val");
		student2.addBookList("딥러닝1");
		student2.addBookList("딥러닝2");
		student2.addBookList("딥려닝3");
		
		Student student3 = new Student("Jon");
		student3.addBookList("머신러닝1");
		student3.addBookList("머신러닝2");
		student3.addBookList("머신러닝1");
		student3.addBookList("머신러닝2");
		student3.addBookList("머신러닝1");
		student3.addBookList("머신러닝2");
		
		student1.showInfo();
		System.out.println();
		
		student2.showInfo2();
		System.out.println();
		
		student3.showInfo3();
		System.out.println();
		
		
	}
}