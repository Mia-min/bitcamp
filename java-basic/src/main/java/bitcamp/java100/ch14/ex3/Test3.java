package bitcamp.java100.ch14.ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream(new File("sample/b.jpg"));

		//FileOutputStream out = new FileOutputStream(new File("sample/b2.jpg"));
		
		byte[] buf = new byte[4000000];
		int len = 0;
		
		
		long start = System.currentTimeMillis();
		
		while((len = in.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		
		long end = System.currentTimeMillis();
		System.out.printf("걸린시간 = %d\n", end - start);

		int b;

		int count = 0;
		while ((b = in.read()) != -1) {
			out.write(b);
		}
		

		in.close();
		out.close();
		
		System.out.println("파일 복사 완료");
	}
}
