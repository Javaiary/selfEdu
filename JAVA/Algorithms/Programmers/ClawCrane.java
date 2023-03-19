package programmers;

import java.util.Stack;

public class ClawCrane {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0; // 터진 인형 개수

		Stack<Integer> bucket = new Stack<>(); // 바구니

		for (int i = 0; i < moves.length; i++) {
			int target = moves[i]-1;
			int crane = 0; // 크레인으로 뽑은 인형(숫자)
			int j = 0;
			
			while(j < board.length) {
				if (board[j][target] != 0) {	// 해당 칸의 인형 유무 확인
					crane = board[j][target];	// 인형 뽑음
					board[j][target] =0;		// 인형 뽑은 칸 초기화
					break;
				}
				j++;
			}
			// 해당 레인에 인형이 있었다면 실행
			if (j < board.length) {
				if (!bucket.empty() && crane == bucket.peek()) {
					bucket.pop();
					answer += 2;
				} else
					bucket.push(crane);
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
}
