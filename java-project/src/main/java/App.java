import java.util.Scanner;

public class App {
	
	static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    	while(true) {
    		Score score = new Score();
    		score.input();
    		
    		ScoreDao.add(score);
    		
    		if(!confirm("계속 하시겠습니까? "))
    			break;
    	}
    	
        for (i = 0; i < ScoreDao.length; i++) {
            ScoreDao.get(i).print();
        }
    }
}




