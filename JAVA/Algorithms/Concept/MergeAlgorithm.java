import java.util.Arrays;

//[?] 2개의 정수 배열 합치기: 단 2개의 배열은 오름차순으로 정렬되어 있다고 가정
/*
 * 병합 알고리즘(MergeAlgorithm) : 오름차순으로 정렬되어있는 정수 배열을 하나로 병합
 */
public class MergeAlgorithm {
    public static void main(String[] args) {
        //[1]
        int[] first = {1,3,5,};
        int[] second = {2,4};
        int M = first.length;
        int N = second.length;      //M:N 관행

        int[] merge = new int[M+N]; //병합된 배열

        int i = 0; int j = 0; int k =0; //i,j,k 관행
        //[2] Process : Merge
        while(i < M && j <N){       // 둘 중 하나라도 배열의 끝에 도달할 때까지 반복
            if (first[i] < second[j]) {
                merge[k++] = first[i++];
            }
            else{
                merge[k++] = second[j++];
            }
        }
// 두 배열 중 한 배열을 merge에 다 넣을 때 까지 반복 후, 하나의 배열만 남았을 때 실행되는 코드
        while(i < M){               // 첫 번째 배열이 끝까지 도달할 때까지 반복
            merge[k++] = first[i++];
        }
        while(j < N){               // 두 번째 배열이 끝까지 도달할 때까지 반복
            merge[k++] = second[j++];
        }         
        //[3] Output
        for(int item : merge){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(merge));
    }

}
