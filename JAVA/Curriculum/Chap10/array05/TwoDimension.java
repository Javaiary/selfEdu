package kr.co.ezenac.array05;

public class TwoDimension {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6,7}}; 	//생성과 동시에 초기화
		
		int i,j ;
		for(i = 0; i< arr.length ; i++) {		//배열의 행만큼 반복
			for(j=0; j < arr[i].length; j++ ) {	//배열 i행의 길이만큼 반복
				System.out.print(arr[i][j] + " "); 
			}
			System.out.print("\t" + i + "행의 길이: " + arr[i].length);
			System.out.println();
		}
		
	}
}
