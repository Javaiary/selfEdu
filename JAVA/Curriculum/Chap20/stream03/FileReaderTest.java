package kr.co.ezenac.stream03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("reader.txt");
	
		int i;
		while((i=fr.read()) != -1)
			System.out.print((char)i);		
		// inputStream 사용시에는 한글이 깨짐
		
		fr.close();
	}
	

}
