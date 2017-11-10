package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1_1 {
	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream(new File("sample/b.jpg"));

		int b;

		int count = 0;
		while ((b = in.read()) != -1) {
			count++;
		}

		in.close();
		
		System.out.println("파일 복사 완료");
	}
}
