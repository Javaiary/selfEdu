package programmers;

public class CorrectBracket {
	static boolean solution(String s) {
		boolean answer = true;

		if (s.startsWith(")")|| s.endsWith("(") || s.length() % 2 != 0) {
			// ),( 로 시작/끝나거나 s의 길이가 홀수이면 false 리턴
			answer = false;
		} else {
			// countA : ( 의 개수
			// countB : ) 의 개수
			int countA = 0;
			int countB = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {		// "" : String , '' : char
					countA += 1;
				} else {
					countB += 1;
				}
				if(countB > countA) {
					answer = false;
					break;
				}
			}
			if(countA != countB) {
				answer = false;
			}
		}
		return answer;
	}
}
