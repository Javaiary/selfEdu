package kr.co.ezenac.string;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("ezen");
		String str2 = new String("ezen");
		
		System.out.println(str1.equals(str2)); //T
		System.out.println(str1 == str2);	   //F
		//힙메모리에 각각 주소번지에 올라가 있기 때문에 같지 않다고 뜸(인스턴스)
		
		String str3 = "ezen!";
		String str4 = "ezen!";
		
		System.out.println((str3 == str4));	   //T
		//상수풀에 저장이 되기 때문에 같은 곳을 가리킴
		
		
		
		
		
		
		
		
		
		
	}
}
