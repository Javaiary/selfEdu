package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class FileInputOutputStreamTest {
	public static void main(String[] args) {
		// 파일 내용을 배열로 만들어서 저장후 새로 만드는 파일에 배열을 써 넣음 (아웃풋파일.write(배열))
		byte[] bs = new byte[26];
		byte data = 65;
		for (int i = 0; i < bs.length; i++) {
			bs[i] = data;
			data++;
		}
		try(FileOutputStream fos = new FileOutputStream("output3.txt", true);
				FileInputStream fis = new FileInputStream("output2.txt")){
			
			fos.write(bs);
			int ch;
			while((ch = fis.read()) != -1)
				System.out.print((char)ch);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
