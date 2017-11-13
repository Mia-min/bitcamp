package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_1 {
	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream(new File("sample/jls9.pdf"));

		FileOutputStream out = new FileOutputStream(new File("sample/jls9_2.pdf"));

		int b;
		
		long start = System.currentTimeMillis();

		int count = 0;
		while ((b = in.read()) != -1) {
			out.write(b);
		}
		
		long end = System.currentTimeMillis();
		System.out.printf("걸린시간 = %d\n", end - start);

		in.close();
		out.close();
		
		System.out.println("파일 복사 완료");
	}
}
