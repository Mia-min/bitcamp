package bitcamp.java100.ch16.ex2;

public class Test1 {
	
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000000);
		
		ATM t1 = new ATM("gangnam", account);
		ATM t2 = new ATM("jongno", account);
		ATM t3 = new ATM("busan", account);
		ATM t4 = new ATM("gwangju", account);
		ATM t5 = new ATM("pohang", account);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	
		System.out.println("인출 시작");
	}
	
}
