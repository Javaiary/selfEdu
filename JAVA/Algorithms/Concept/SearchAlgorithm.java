//[?] 정렬되어 있는 데이터를 이진 검색 (이분 탐색) 을 사용하여 반씩 나눠서 검색
/**
 * 검색 알고리즘(SearchAlgorithm): 주어진 데이터에서 특정 데이터 찾기
 */
public class SearchAlgorithm {

    public static void main(String[] args) {
        //[1] Input
        int[] data = {1,3,5,7,9}; //오름차순으로 정렬되었다고 가정!
        int N = data.length; // 의사코드
        int search= 9; // 검색할 데이터
        boolean flag = false; // 찾았으면 t 그렇지 않으면 f
        int index= -1 ;// 찾은 위치(인덱스)
        //[2] Process : index scan(풀스캔 대신)
        int low = 0; // min : 낮은 인덱스
        int high = N -1 ; // max: 높은 인덱스
        while (low <= high) {
            int mid = (low + high)/ 2; // 중간 인덱스 구하기
            if (data[mid] == search) {
                flag = true; index = mid ; break;
            }
            if (data[mid] < search) {
                low = mid + 1; // 찾을 데이터가 크면 오른쪽 영역으로 이동
            }
            else {
                high= mid -1; // 찾을 데이터가 작으면 왼쪽 영역으로 이동
            }
            
            
        }

        //[3] Output
        if (flag) {
            System.out.println(search + "를" + index + "위치에서 찾았습니다.");
        }
        else{
            System.out.println("찾지 못했습니다.");
        }
    }
}