//[?] 주어진 데이터 중에서 가장 작은 [짝수] 값

/**
 * 최소값 알고리즘 (MinAlgorithm): 주어진 범위+ 주어진 조건의 자료들의 가장 작은 값
 */
public class MinAlgorithm {

    public static void main(String[] args) {
       //[1] intialize
        int min = Integer.MAX_VALUE; //정수 형식의 데이터 중 가장 큰 값으로 초기화

       //[2] input : 이진수로 표현 = 2
        int[] numbers= {0b0010, 5, 3, 7, 1 };

       //[3] process: MIN
       for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] < min && numbers[i] % 2 == 0) {
            min= numbers[i]; // 더 작은 값으로 할당
        }
        
       }
 
       //[4] output
       System.out.print("짝수 최소값: " + min); 
    }
}