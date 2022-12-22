package kr.co.ezenac.reference;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(001, "Kilmer");
		
		student.setKoreaSubject("국어", 90);
		student.setMathSubject("수학", 100);
		
		student.showStudentScore();
		
		Student student2 = new Student(002, "Jon");
		
		student2.setKoreaSubject("국어", 50);
		student2.setMathSubject("수학", 70);
		student2.showStudentScore();
		
		
	}

}
