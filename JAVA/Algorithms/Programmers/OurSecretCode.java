package programmers;

public class OurSecretCode {
	public static String solution(String s, String skip, int index) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char target = s.charAt(i); // i번째 문자

				int idxCnt = 0;
				// idxCnt 가 index 와 같지 않거나, 현재 target값이 skip에 포함되면 재실행
				while (idxCnt != index || skip.contains(Character.toString(target)) ) {
				/*
				 * 	skip에 target값이 들어있는지 확인
				 * 	skip에 있는 문자가 아니면 idxCnt와 target 모두 증가
				 *	skip에 있는 문자이면 idxCnt를 건너뛰고 target만 증가
				 */
					if (!skip.contains(Character.toString(target))) {
						idxCnt++;
						target++;
					}else target++;
					target = target>122? target-=26: target;
					
			}
			answer = answer.concat(Character.toString(target));
		}
		return answer;
	}	

	public static void main(String[] args) {
		String s = "ybcde";
		String skip = "az";
		int index = 1;

//		String s = "zzzzz";
//		String skip = "bcdefghijk";
//		int index = 20;
		
		
		System.out.println(solution(s, skip, index));
	}
}
