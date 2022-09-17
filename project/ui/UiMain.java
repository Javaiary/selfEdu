package kr.co.ezenac.project.ui;

import kr.co.ezenac.project.school.School;
import kr.co.ezenac.project.school.Score;
import kr.co.ezenac.project.school.Student;
import kr.co.ezenac.project.school.Subject;
import kr.co.ezenac.project.school.view.GenerateGradeDisplay;
import kr.co.ezenac.project.utils.Constant;

/**
 * 1. 문제 정의	  __
 * 		Ezen 이라는 학교가 있다. 
 * 		이 학교에는 5명의 학생들이 수업을 듣습니다.
 * 		__			  --
 * 		과목은 국어/수학 2개, 각 학생은 두 과목을 모두 수강한다.
 * 		전공은 국어교육학/컴퓨터공학 2가지
 * 		국어교육학과는 국어가 필수과목이고, 컴퓨터 공학과는 수학이 필수과목이다.
 * 				 __
 * 		이번 학기에 성적이 아래와 같이 나왔다.
 * 		-------------------------------------------------------------------------
 * 		이름 			학번			전공			필수과목			국어점수			수학점수
 * 		스티브잡스	  20220915	  국어교육학과	  	 국어				  95			  56
 * 		이순신	  20220916	  컴퓨터공학과		 수학				  94			  98
 * 		리누스토발즈  20220917	  국어교육학과	     국어				  100			  88
 * 		제임스고슬링  20220918	  국어교육학과		 국어				  89			  94
 * 		이도		  20220919	  컴퓨터공학과		 수학				  83		      56
 * 
 * 		학점을 부여하는 방법은 여러가지가 있습니다. 
 * 		1) A~F 부여하는 방법
 * 		2) S~F 부여하는 방법 등
 * 		
 * 		일반 과목이라면 A~F로, 필수과목이라면 S~F로 분류합니다.
 * 		
 * 		점수에 따른 학점 부여 기준
 * 		필수과목학점
 * 		S		A		B		C		D		F
 * 		---------------------------------------------
 * 		95~100	90~94	80~89	70~79	60~69	60미만
 * 
 * 		일반과목학점
 * 		A		B		C		D		F
 * 		-------------------------------------
 * 		90~100	80~89	70~79	55~69	55미만
 * 
 * 		학점 결과를 아래화 같이 나올 수 있도록 구현
 * 
 * 		국어과목 학점 결과 >>> 
 * 		------------------------------------------------
 * 		이름 			학번			필수과목		점수		학점
 * 		------------------------------------------------
 * 		스티브잡스	  20220915	  	 국어			95		 S	  
 * 		이순신	  20220916	 	 수학			94		 A
 * 		리누스토발즈  20220917	  	 국어		    100		 S	 
 * 		제임스고슬링  20220918	  	 국어		    89		 B	  
 * 		이도		  20220919	  	 수학			83		 B
 * 		================================================
 * 
 * 		수학과목 학점 결과 >>> 
 * 		------------------------------------------------
 * 		이름 			학번			필수과목		점수		학점
 * 		------------------------------------------------
 * 		스티브잡스	  20220915	  	 국어			56		 D	  
 * 		이순신	  20220916	 	 수학			98		 S
 * 		리누스토발즈  20220917	  	 국어		    88		 B	 
 * 		제임스고슬링  20220918	  	 국어		    94		 A	  
 * 		이도		  20220919	  	 수학			56		 F
 * 		================================================
 * 		학점 정책이 추가되는 경우를 고려하여 객체를 설계하고 인터페이스(interface)를 선언하여
 * 		각 정책이 해당 인터페이스를 구현하도록 하시오.
 * 
 * 2. UML 클래스 정의, 관계
 * 3. 구현
 * 4. 테스트
 * 5. 업그레이드
 * 	- 과목과 학점 정책이 추가
 * 		- 골프 과목이 새로 개설되고 이 과목의 평가 정책은 pass/Non-Pass로 정해짐
 * 		- 70점 이상인 경우 pass, 미만인 경우 fail
 * 		- 전체 5명 학생 중 3명만 수강신청함
 *  - 학점 결과를 다음과 같이 구현하시오.
 *  수학과목 학점 결과 >>> 
 * 		------------------------------------------------
 * 		이름 			학번			필수과목		점수		학점
 * 		------------------------------------------------
 * 		스티브잡스	  20220915	  	 국어			95		 P	  
 * 		이순신	  20220916	 	 수학			85		 P
 * 		리누스토발즈  20220917	  	 국어		    55		 N	
 * 		================================================
 */
public class UiMain {
	School ezenSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject golf;
	
	GenerateGradeDisplay gradeDisplay = new GenerateGradeDisplay();
	
	
	public static void main(String[] args) {
		
		UiMain uiMain = new UiMain();
		
		uiMain.createSubject();				//시험과목 생성
		uiMain.createStudent();				//시험 응시 학생 생성
		
		
		String display = uiMain.gradeDisplay.getDisplay();
		System.out.println(display);
	}

	public void createStudent() {
		Student student1 = new Student("스티브잡스"	, 20220915 , korean); 
		Student student2 = new Student("이순신", 20220916 , math); 
		Student student3 = new Student("리누스토발즈", 20220917 , korean); 
		Student student4 = new Student("제임스고슬링", 20220918 , korean); 
		Student student5 = new Student("이도"	, 20220919 , math); 
		
		ezenSchool.addStudent(student1);
		ezenSchool.addStudent(student2);
		ezenSchool.addStudent(student3);
		ezenSchool.addStudent(student4);
		ezenSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		golf.register(student1);
		golf.register(student2);
		golf.register(student3);
		
		//과목별 성적 입력
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student1, golf, 95);
		
		addScoreForStudent(student2, korean, 94);
		addScoreForStudent(student2, math, 98);
		addScoreForStudent(student2, golf, 85);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, golf, 55);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 94);
		
		addScoreForStudent(student5, korean, 83);
		addScoreForStudent(student5, math, 56);
	}
	// 학생
	private void addScoreForStudent(Student student, Subject subject, int score) {
		Score score1 = new Score(student.getStudentId(), subject, score);
		student.addSubjectScore(score1);
	}

	public void createSubject() {
		korean = new Subject(Constant.KOREAN, "국어");
		math = new Subject(Constant.MATH, "수학");
		golf = new Subject(Constant.GOLF, "골프");
		
		//else if를 추가하지 않고 직접 학점부여방식을 지정해주는 방법
		//golf.setGradeType(Constant.PN_TYPE);
		
		ezenSchool.addSubject(korean);
		ezenSchool.addSubject(math);
		ezenSchool.addSubject(golf);
	}
}
