package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTestself {
	public static void main(String[] args)  {
		try (FileInputStream fis = new FileInputStream("input.txt")){
			FileOutputStream fos = new FileOutputStream("inputCopy.txt");
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
				}
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("카피되었습니다.");
	
	}
}
