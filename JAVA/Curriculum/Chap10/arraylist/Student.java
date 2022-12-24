package kr.co.ezenac.arraylist;

import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String studentName;
	ArrayList<Subject> subjectList;	
	//초기화 필요(3개 다)

	//생성자를 통해 초기화
	public Student(int studentId, String studentName) {	
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
	
		subjectList = new ArrayList<>(); 
		
	}
	public void addSubject(String name,int score) { // addSubject 메서드 생성
		Subject subject = new Subject();			// subject 형식지정 생성
		
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println("학생"+this.studentName + "의 " + subject.getName()+"과목 성적은"+
								subject.getScorePoint() + "점 입니다.");
		}
		System.out.println("학생"+this.studentName + "의 총점은 " + total + "점 입니다.");
	}
	
}
