package kr.co.ezenac.project.grade;

public class PNPEvlaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String grade;
		if (score >= 70) {
			grade= "P";
		}
		else 
			grade = "N";
		return grade;
	}

}
