package programmers;

public class TheNumberOfAliquotAndSum {
	public int solution(int left, int right) {
		int answer = 0;
        for(int i = left; i <= right; i++) {
        	int alCount = 1;	// 약수의 개수 카운트 (자기자신 1)
        	
    		// 자기자신의 절반 이상인 약수는 존재하지 않으므로  i/2 까지만 탐색
        	for(int j = 1; j <=i/2; j++) {
        		if (i%j ==0) {
					alCount++;	//나누어 나머지가 없는 수가 약수이므로 약수 카운트 증가
				}
        	}
        	// 약수의 개수가 짝수이면 더하고 홀수이면 빼기
        	if (alCount%2 ==0) {
				answer += i;
			}else {
				answer -= i;
			}	
        }
        return answer;
    }
}
