package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class School {
//school은 하나만 있으면 되기 때문에 싱글톤 패턴을 적용
	private static School instance = new School();

	private School() {};	
	// 인스턴스가 아닌 기본 생성자를 호출하는 것을 막기 위해 기본생성자를 private선언해줌

	public static School getInstance() {
		if (instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	//다수의 학생/과목을 입력하기 위해 ArrayList타입 사용
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Subject> subjects = new ArrayList<>();

	public ArrayList<Student> getStudents() {
		return students;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	
	
	//set이아닌 ArrayList에 add하는 방식으로 설정
	//add student/subject메서드를 통해 배열에 학생/과목을 추가할 수 있음
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
}
