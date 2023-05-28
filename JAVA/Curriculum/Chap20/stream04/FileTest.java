package kr.co.ezenac.stream04;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File directory = new File("C:/Temp1/directory");
		File file1 = new File("C:/Temp1/file1.txt");
		File file2 = new File("C:/Temp1/file2.txt");
		
		if (directory.exists()== false) {
			directory.mkdirs();			// 경로상 없는 디렉토리를 전부 생성해 줌 	
		}
		if (file1.exists() == false) {
			file1.createNewFile();
			System.out.println("file1.txt 생성");
		}
		if (file2.exists() == false) {
			file2.createNewFile();
			System.out.println("file2.txt 생성");
		}
		
		File temp = new File("C:\\workspace-java");
		

		File[] contents = temp.listFiles();
		System.out.println("날짜 \t\t 시간 \t 크기 \t\t 이름");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		System.out.println("-----------------------------------------------");
		
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.print("\t <DIR> \t\t"+ file.getName());}
				else {
					System.out.print("\t\t" +file.length()+ "\t" + file.getName());}
				System.out.println();
			}
			
		}
	}

