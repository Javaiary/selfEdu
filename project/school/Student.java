package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class Student {
	
	private String studentName;		//이름
	private int StudentId;			//학번
	private Subject majorSubject;	//전공(과목 2개 중)
	private ArrayList<Score> scores = new ArrayList<>();	// 점수[배열]
	
	
	public Student(String studentName, int studentId, Subject majorSubject) {
//		super();
		this.studentName = studentName;
		StudentId = studentId;
		this.majorSubject = majorSubject;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public ArrayList<Score> getScores() {
		return scores;
	}
	
	// 과목별 성적 입력 기능(메서드)
	public void addSubjectScore(Score score) {
		scores.add(score);
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	
	
	
	
	
}
