// 하위폴더를 모두 포함하여 .클래스 파일을 찾아 파일명을 출력하라
// 패키지 이름을 포함하여 출력해라
// ex. bitcamp.java100.ch14.ex1.Test12
package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.util.ArrayList;

public class Test12 {

	static ArrayList<File> fileList = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		File file = new File(".");

		while (fileList.size() > 0) {
			printFiles(fileList.remove(0));
		}
	}

	static void printFiles(File dir) throws Exception {
		File[] files = dir.listFiles();

		String path;
		int i = 0;
		for (File f : files) {
			if (f.isFile() && f.getName().endsWith(".class")) {
				path = f.getCanonicalPath();
				i = path.indexOf("bin") + 4;
				
				System.out.println(
						path.substring(i)
						.replace(".class", "")
						.replace("/", ".")
						.replace("\\", "."));
			}

			if (f.isDirectory()) {
				printFiles(f);
			}
		}
	}
}
