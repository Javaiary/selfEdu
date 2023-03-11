package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("input.txt")) {

			int i;
			while ((i = fis.read()) != -1) {		//문자열 맨 끝이 -1 값 : 끝까지 읽어라
				System.out.println((char) i);
			}
			
			// int i 선언 없이 했을 경우
//			while ((fis.read()) != -1) {			//1번 읽음   3번 읽음	5번 읽음
//				System.out.print(fis.read());		//2번 출력4번 출력	6번 출력
//			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
