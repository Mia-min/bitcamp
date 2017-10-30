package bitcamp.java100.ch08.ex5;

public class ScoreEx extends Score {
	int sci;
	int soc;

	public ScoreEx() {
		
	}

	public ScoreEx(int no, String name, int kor, int eng, int math, int sci, int soc) {
		super(no, name, kor, eng, math);
		this.sci = sci;
		this.soc = soc;
		
		this.compute();
	}
	
	
	
}
