package kr.co.ezenac.member02;

public class Student {

	public int studentId;
	public String studentName;
	public int grade;
	//멤버들에 대한 초기화 or 초기화해주는 메서드를 호출하는 생성자
	//마우스우클릭 - source - Generate constructor
	public Student(int studentId, String studentName, int grade) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentId + "이고, " +
				grade + "학년 입니다.";
	}
	
}
