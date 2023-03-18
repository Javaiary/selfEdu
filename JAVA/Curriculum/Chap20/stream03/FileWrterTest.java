package kr.co.ezenac.stream03;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrterTest {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');			//문자 하나 출력
			char[] buf = {'B', 'C', 'D', 'E', 'F'};
			fw.write(buf);			// 문자 배열 출력
			
			fw.write("안녕하세요. 좋은 아침입니다."); 			// String 출력
			fw.write(buf, 1, 2);						// 문자 배열에서 일부 출력
			fw.write("65");	 							// 숫자를 그대로 출력
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}
}
