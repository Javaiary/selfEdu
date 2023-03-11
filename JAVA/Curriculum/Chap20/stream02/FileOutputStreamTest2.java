package kr.co.ezenac.stream02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try(fos){
			byte[] bs = new byte[26];
			byte data = 65;				// 'A'의 아스키 코드 값
			for(int i = 0; i <bs.length; i++)
				bs[i] = data++;
			
			fos.write(bs); 				// 배열 한꺼번에 출력하기
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	System.out.println("출력 완료");
	
	String string = new String("Hello");
	
			
	
	}
}
