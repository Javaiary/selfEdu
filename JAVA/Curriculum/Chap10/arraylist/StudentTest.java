package kr.co.ezenac.arraylist;
/*
 *  학생이 수강한 과목의 학점을 출력하시오.
 *  2022학번의 Lee와 2021학번 Shin 두 학생이 있다.
 *  Lee학생은 국어와 수학 2과목을 수강했고,
 *  Shin학생은 국어, 수학, 영어 3과목을 수강했습니다. 
 *  
 *  Lee 학생은 국어 100점, 수학은 70점
 *  Shin 학생은 국어 70점, 수학 40점, 영어 100점
 *  ArrayList를 활용하여 두 학생의 과목 성적과 총점을 구하시오. 
 *  
 */
public class StudentTest {
	public static void main(String[] args) {
		
		Student student1 = new Student(2022, "LEE");	//생성자로 초기화해줌. 클래스를 참조하여 변수 생성
		student1.addSubject("국어",	100);
		student1.addSubject("수학",	70);
		
		Student student2 = new Student(2021, "Shin");
		student2.addSubject("국어",	70);
		student2.addSubject("수학",	40);
		student2.addSubject("영어", 100);
		
		student1.showInfo();
		student2.showInfo();
	}
}
