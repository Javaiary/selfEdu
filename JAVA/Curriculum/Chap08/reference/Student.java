package kr.co.ezenac.reference;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		this.studentId = id;	//매개변수와 이름이 다르기 때문에 this를 써 줄 필요는 없음
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	public void setKoreaSubject(String name , int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}
	//setMathSubject()
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total+ "점 입니다.");
	}
	
	
	
	
}
