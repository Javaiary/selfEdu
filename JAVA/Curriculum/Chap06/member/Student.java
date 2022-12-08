package kr.co.ezenac.member;
/*
 * 1. 클래스는 대문자로 시작함.
 * 2. java파일 하나에 여러 개가 있을 수 있음(classA, classB..)
 * 		- 단, public 클래스는 하나임.
 * 		- public 클래스와 .java파일의 이름은 동일함.
 */
public class Student {
//	public Student() {
//	}						//기본 생성자가 생략되어있음
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}
	public String getStudentName() {
		return studentName;
	}
}

