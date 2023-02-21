package programmers;

public class CollatzConjecture {
	public int solution(long num) {
		int answer = 0;
		if (num != 1) {
			for (int i = 1; i <= 500; i++) {
				if (num % 2 == 0) {
					num /= 2;
				} else {
					num = num * 3 + 1;
				}
				if (num == 1) {
					answer = i;
					break;
				}
			}
			// 반복문 종료시점에서 answer 값이 0일 경우 -1 리턴
			if (answer == 0) {
				answer = -1;
			}
		}else {
			answer = 0;
		}
		return answer;
	}
}
