package kr.co.ezenac.stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest03 {
	public static void main(String[] args) {
		System.out.println("입력 후 '끝'이라고 쓰세요.");
		int i;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '끝') {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
