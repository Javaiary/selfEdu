package programmers;
import java.util.ArrayList;
public class OXQuiz {
	public ArrayList<String> solution(String[] quizes) {
	      ArrayList<String> answer = new ArrayList<>();
	        int x;
	        int y;
	        int z;
	        
	        for (String quiz : quizes) {
	         String[] factor = quiz.split(" ");
	         x = Integer.parseInt(factor[0]);
	         y = Integer.parseInt(factor[2]);
	         z = Integer.parseInt(factor[4]);
	         
	         if (operating(x, y, factor[1]) == z) {
	            answer.add("O");
	         }else {
	            answer.add("X");
	         }
	      }
	        return answer;
	    }
	   // 연산자 확인 후 계산하는 함수
	   public static int operating(int a, int b, String operator) {
	      int stmt = 0;
	      switch (operator) {
	      case "+":
	         stmt= a+b;
	         break;
	      case "-":
	         stmt= a-b;
	         break;
	      case "*":
	         stmt= a*b;
	         break;
	      case "/":
	         stmt= a/b;
	         break;
	      }
	      return stmt;
	   }
}
