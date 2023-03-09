package programmers;

public class SumOfConsecutiveNums {
	public int[] solution(int num, int total) {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += i;
		}
		int start = (total - sum) / num;
		int[] answer = new int[num];

		for (int i = 0; i < num; i++) {
			answer[i] = start + i;
		}
		return answer;
	}
}
