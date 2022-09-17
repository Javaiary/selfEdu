package kr.co.ezenac.project.school;

public class Score {

	private int studentId;		//학번
	private Subject subject; 	//과목 (has a 관계)- public class이기 때문에 가져올 수 있음
								// getter를 통해 subject의 속성들을 가져올 수 있음
	private int score;			//점수
	
	
	public Score(int studentId, Subject subject, int score) {
		//super();
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}

	public int getStudentId() {
		return studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}
	
	
	
}
