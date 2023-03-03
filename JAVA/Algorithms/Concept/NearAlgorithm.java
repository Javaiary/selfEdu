//[?] 원본 데이터 중에서 대상 데이터와 가장 가까운 값을 구하기
/**
 * 근사값 알고리즘(NearAlgorithm) : 차이값의 절대값의 최소값
 */
public class NearAlgorithm {
    public static int Abs(int number) {
        return (number < 0) ? -number: number;
        //[0] 절대값 구하기 로컬함수
    }

    public static void main(String[] args) {
        
        //[1] 초기화영역
        int min = Integer.MAX_VALUE; // 차이값의 절대값의 최소값이 담길 그릇

        //[2] 입력
        int[] numbers = { 10, 20, 30, 27, 17};
        int target = 25;// Target과 가까운 값
        int near = 0; //가까운 값

        //[3] 처리
        for (int i = 0; i < numbers.length; i++) {
            int abs = Abs(numbers[i] - target);
            if(abs < min) {
                min = abs; // MIN: 최소값 알고리즘
                near = numbers[i];   // NEAR: 차이값의 절대값의 최소값일 떄의 값         

            }                  
                        
        }
        //[4] 결과
        System.out.println(target + "와 가장 가까운 값: " + near + "(차이: " + min+ ")");
    }
}