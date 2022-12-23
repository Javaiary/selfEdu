package kr.co.ezenac.array02;

public class StringArray {
	public static void main(String[] args) {
		String[] name = new String[7];
		//name이라는 주소에 heap메모리 7칸짜리 생성됨. 값은 null
		
		name[0] = new String("Stephen");
		name[1] = new String("Stephen2");
		name[2] = new String("Stephen3");
		name[3] = new String("Stephen4");
		name[4] = new String("Stephen5");
		name[5] = new String("Stephen6");
		name[6] = new String("Stephen7");
		
		int cnum = 0;
		for(int i =0; i<name.length; i++) {
			System.out.println(name[i]);
			cnum += name[i].length();		//i번째 배열의 문자 수 누적
		}
		
		System.out.println("총 문자의 수: " + cnum);

		
	}

}
