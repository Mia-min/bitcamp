// ## 연산자 - 비트 연산자 (&, |, ~, ^) 응용
// - 비트 연산자의 활용 예
//

package bitcamp.java100;

public class Test15_11_3 {

    public static void main(String[] args) {
// 임무: 파일의 정보를 저장하라!
// - 디렉토리여부, 소유주/그룹/기타 사용자의 읽기, 쓰기, 실행 권한 정보
//
// 방법3: int 메모리와 비트 연산자를 이용하여 처리
        // => 사용자 권한 정보를 담을 int 메모리를 한개 만든다.
    	
    	int p1 = 0;
    	   	
        // => 비트에 사용자 권한을 저장한다.
    	p1 = 0b0_111_101_101;
        
        // => 권한 검사에 사용 할 필터를 준비한다.
    	final int DIRECTORY = 0X0200; //0b0010_0000_0000;
    	final int OWNER_READ = 0X0100; //0b0010_0000_0000;
    	final int OWNER_WRITE = 0X0080; //0b0010_0000_0000;
    	final int OWNER_EXE = 0X0040; //0b0010_0000_0000;
    	final int GR0UP_READ = 0X0020; //0b0010_0000_0000;
    	final int GR0UP_EXE = 0X0010; //0b0010_0000_0000;
    	final int GR0UP_WRITER = 0X0008; //0b0010_0000_0000;
    	final int OTHDER_WRITDE = 0X0004; //0b0010_0000_0000;
    	final int OTHER_READE = 0X0002; //0b0010_0000_0000;
    	final int OTHER_EXE = 0X0001; //0b0010_0000_0000;
    	// => 사용 권한 검사
        System.out.print((p1 & DIRECTORY) == DIRECTORY ? "d" : "-");
        System.out.print((p1 & OWNER_READ) == OWNER_READ ? "r" : "-");
        System.out.print((p1 & OWNER_WRITE) == OWNER_WRITE ? "w" : "-");
        System.out.print((p1 & OWNER_EXE) == OWNER_EXE ? "x" : "-");
        System.out.print((p1 & GR0UP_READ) == GR0UP_READ ? "r" : "-");
        System.out.print((p1 & GR0UP_EXE) == GR0UP_EXE ? "w" : "-");
        System.out.print((p1 & GR0UP_WRITER) == GR0UP_WRITER ? "x" : "-");
        System.out.print((p1 & OTHDER_WRITDE) == OTHDER_WRITDE ? "r" : "-");
        System.out.print((p1 & OTHER_READE) == OTHER_READE ? "w" : "-");
        System.out.print((p1 & OTHER_EXE) == OTHER_EXE ? "x" : "-");
        System.out.println();
    }
}




















