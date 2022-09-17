package kr.co.ezenac.project.grade;
/**
 *  * 		일반과목학점
 * 		A		B		C		D		F
 * 		-------------------------------------
 * 		90~100	80~89	70~79	55~69	55미만
 *
 */
public class BasicEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int score) {
		String grade;
		if (score>=90 && score <=100) {
			grade= "A";
		}
		else if (score >=80 && score <= 89) {
			grade = "B";
		}
		else if (score >=70 && score <= 79) {
			grade = "C";
		}
		else if (score >=55 && score <= 69) {
			grade = "D";
		}
		else 
			grade = "F";
		return grade;
	}

}
