package kr.co.ezenac.constructor02;

import javax.annotation.processing.SupportedSourceVersion;

public class StudentTest {
	public static void main(String[] args) {
		//기본 생성자 호출
		Student student =new Student();
//		System.out.println(student.getAge());
		System.out.println(student.toString());		// 해시코드값(참조번지) 호출
		
		System.out.println();
		//매개변수가 있는 생성자 호출
		Student student2 = new Student("Val", 30);
		System.out.println(student2);
		
		//매개변수가 String뿐인 생성자 호출 
		Student student3 = new Student("신사임당");
		System.out.println(student3);
		
		//매개변수가 int뿐인 생성자 호출
		Student student4 = new Student(26);
		System.out.println(student4);
	}
}
