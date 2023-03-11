package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest02 {
	public static void main(String[] args) throws IOException {
	FileInputStream fInputStream = new FileInputStream("output3.txt");
	FileOutputStream fOutputStream = new FileOutputStream("output4.txt");
	
	byte[] readBytes = new byte[100];
	int data = 0;
	while ((data= fInputStream.read(readBytes)) != -1) {
		fOutputStream.write(readBytes);
		System.out.println("읽은 바이트 수 : " + data);
	}
	fOutputStream.flush();
	System.out.println("복사본 파일이 생성되었습니다.");
	
	fInputStream.close();
	fOutputStream.close();
	
	}
}
