// 하위폴더를 모두 포함하여 .클래스 파일을 찾아 파일명을 출력하라
package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test11 {
 
    public static void main(String[] args) throws Exception {
        File file = new File(".");

        printFiles(file);
    }
    
    static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();
        
        for (File f : files) {
        	if(f.isFile() && f.getName().endsWith(".class")) { //만약 f가 파일이고 &&그리고 f의 이름 마지막이 .class면 
        		System.out.println(f.getName()); //그 이름 출력해라
        	}
            //System.out.println(f.getCanonicalPath());
            if (f.isDirectory()) {
                printFiles(f);
            }
        }
    }

}



