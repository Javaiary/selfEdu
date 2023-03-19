package programmers;

public class PersonalityTest {
	public String solution(String[] survey, int[] choices) {
			        String answer = "";
			        // 비동의 - 동의 선택지
			        //RT, CF, MJ, AN 
			        // 동점인 경우 알파벳순 
			        
			        int[] personality = new int[8];
			        // 각각 R, T, C, F, J, M, A, N 의 점수를 담을 배열
			        
			        for (int i = 0; i < survey.length; i++) {

				        // 비동의 선택지 / 동의 선택지 
				        int disagree = applyScore(survey[i].charAt(0));
				        int agree = applyScore(survey[i].charAt(1));
		                
				        // 4 : 모르겠음 선택시 점수 변동이 없으므로 skip
				        switch (choices[i]) {
						case 1: 
							personality[disagree] +=3;
							break;
						case 2: 
							personality[disagree] +=2;
							break;
						case 3: 
							personality[disagree] +=1;
							break;
						case 5: 
							personality[agree] +=1;
							break;
						case 6: 
							personality[agree] +=2;
							break;
						case 7: 
							personality[agree] +=3;
							break;
						}
					}
			        answer = personality[0]>=personality[1] ? answer+'R': answer+'T';
			        answer = personality[2]>=personality[3] ? answer+'C': answer+'F';
			        answer = personality[4]>=personality[5] ? answer+'J': answer+'M';
			        answer = personality[6]>=personality[7] ? answer+'A': answer+'N';
			        
			        return answer;
			    }
			// 점수를 더해줄 인덱스 구하는 함수
			public static int applyScore(char s) {
				int idx = 0;
				switch (s) {
				case 'R':
					idx = 0;
					return idx;
				case 'T':
					idx = 1;
					return idx;
				case 'C':
					idx = 2;
					return idx;
				case 'F':
					idx = 3;
					return idx;
				case 'J':
					idx = 4;
					return idx;
				case 'M':
					idx = 5;
					return idx;
				case 'A':
					idx = 6;
					return idx;
				case 'N':
					idx = 7;
					return idx;
				}
				return idx;
			}
		}
