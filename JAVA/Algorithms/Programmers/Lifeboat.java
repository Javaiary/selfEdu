package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Lifeboat {
	public static int solution(int[] people, int limit) {
		int answer = 0; // 사용된 구명보트의 수
		Arrays.sort(people);
		// people 배열을 ArrayList 형식으로 변환
		ArrayList<Integer> peopleAl = new ArrayList<>();
		for (int person : people) {
			peopleAl.add(person);
		}
		// 남은 사람이 2명 이하 일 때까지 반복
		while (peopleAl.size() > 1) {
			int i = peopleAl.size() - 1;
			// 무조건 혼자 타야하는 경우
			if (peopleAl.get(i) > limit - 40) {
				peopleAl.remove(i);
				answer++;
			}
			// 몸무게를 더해서 limit이하인 승객(2명 탑승 가능)이 있으면 2명 내보냄
			else if (limit - peopleAl.get(0) >= peopleAl.get(i)) {
				peopleAl.remove(i);
				peopleAl.remove(0);
				answer++;
			}
			// 더해서 limit 이하인 승객이 없으면 승객1명만 태워서 내보냄
			else {
				peopleAl.remove(i);
				answer++;
			}
		}
		// 남은사람이 0명이면 skip, 1명이면 구명보트 1개 추가
		answer = peopleAl.size() == 1 ? answer += 1 : answer;

		return answer;
	}

	public static void main(String[] args) {
//		int[] people = {70,80,50};
//		int limit = 100;

		int[] people = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int limit = 100;

		System.out.println(solution(people, limit));
	}
}
