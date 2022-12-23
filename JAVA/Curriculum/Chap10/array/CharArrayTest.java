package kr.co.ezenac.array;
// 문자 배열을 만들어 A~Z까지 배열에 저장하고 이를 출력하시오.
public class CharArrayTest {
	public static void main(String[] args) {
		char[] arr1 = new char[26];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = (char)(i+65) ;
			System.out.print(arr1[i]);
		}
		System.out.println();
		char[] charArr = new char[26];
		char ch = 'A';
		
		for(int i =0; i< charArr.length; i++) {
			charArr[i] = ch++;
		}
				
		for (int i=0; i < charArr.length ; i++) {
			System.out.print((int)charArr[i] + " ");
		}
		System.out.println();
		
		//향상된 for문
		for(char alpha : charArr) { //(배열에 들어있는 타입과 변수명 : 배열이름)
			System.out.println(alpha + ", " + (int)alpha);
		}
		
	}
}
