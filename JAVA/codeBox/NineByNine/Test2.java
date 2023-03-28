package programmers;

public class Test2 {
	

	public void m1(int num) {
		int arr[][] = new int[8][9];	//배열의 개수가 맞을까요?
		Test3 res = new Test3();
		
		for(int i=0; i < 8 ;i++) {	//2단부터 출력이 필요한데 맞을까요?
			for(int j = 0; j <9; j++) {
				arr[i][j] = num *(j+1);
				System.out.println(res.m2(num, j+1, arr[i][j])); //잘못된 부분입니다.
				
			}
			System.out.println(Arrays.toString(arr[i]));
			num++;
		}
	}
}
