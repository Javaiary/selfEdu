package kr.co.ezneac.variable03;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A' ;
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		char ch3 = 67;
		System.out.println((char)ch3);
		
		//char ch4 = -66; // 음수는 대입할 수 없음.
		
		char ch5 = '한';
		char ch6 = '\uD55C' ;	// unicode 접두사 슬래시u
		
		System.out.println(ch5);
		System.out.println(ch6);

	}

}
