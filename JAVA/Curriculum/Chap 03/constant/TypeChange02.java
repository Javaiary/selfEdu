package rk.co.ezenac.constant;

public class TypeChange02 {

	public static void main(String[] args) {
		byte num1 = 1;
		byte num2 = 2;
		//byte result1 = num1 + num2
		//num1/2 가 int로 자동캐스팅 되었기때문에 byte인 result에 할당불가.
		byte result1 = (byte)(num1 + num2);	// 강제 형변환
		
		int num3 = 1;
		int num4 = 2;
		int result2 = num3 + num4;
		
		long num5 = 1;
		long num6 = 2;
		long result3 = num3 + num4; // num4가 long형으로 자동 형변환
		
		float num7 = 1.0f;			// f접미사
		float num8 = 2.0f;
		
		double num9 = 1.0;
		double num10 = 2.0;
		double result = num7 + num8; // num7이 double형으로 자동 형변환
		
		
				
	}

}
