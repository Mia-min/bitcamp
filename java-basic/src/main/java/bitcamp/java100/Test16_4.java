// ## 문자 - 블록과 변수의 범위
//

package bitcamp.java100;

public class Test16_4 {

    public static void main(String[] args) {
    	int i = 0; // int i는 0이다. 또는 i를 초기화 시켰다.
    	while (i < 5) { // i가 5보다 작다면 반복시켜라
    	System.out.println(i++); //출력해라 그리고 i를 증가시켜라 i가 5가 될 때 까지
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 0;
    	while (i < 5) {
    		System.out.print("=>");
    		System.out.println(i);
    		i++;
        }
    	
    	System.out.println("--------------------------");
    	
    	i = 1;
    	while(i <= 5) {
    		int count = 1;
    		while (count <= i) {
    			System.out.print("*");
    			count++;
    		}
    		System.out.println();
    		i++;
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 1;
    	while(i <= 5) {
    		int count = 5 - i;
    		while (count > 0) {
    			System.out.print(" ");
    			count--;
    		}
    		count = 1;
    		while (count <= i) {
    			System.out.print("*");
    			count++;
    		}
    		System.out.println();
    		i++;
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 1;
    	while(i <= 5) {
    		int count = (5 - i) / 2; //5 빼기 i를 하고 그 답에서 2로 나누고 카운트해라
    		while (count > 0) {
    			System.out.print(" ");
    			count--;
    		}
    		count = 1;
    		while (count <= i) {
    			System.out.print("*");
    			count++;
    		}
    		System.out.println();
    		i+= 2; //i는 1, 3, 5씩 홀수로 증가시켜라
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 5;
    	while(i <= 0) {
    		int count = (5 - i) / 2;
    		while (count > 0) {
    			System.out.print(" ");
    			count--;
    		}
    		count = 1;
    		while (count <= i) {
    			System.out.print("*");
    			count++;
    		}
    		System.out.println();
    		i -= 2;
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 0;
    	while (i < 5) {
    		if(i==3) {
    			break;
    		}
    		System.out.println(i);
    		i++;
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 0;
    	while (i < 5) {
    		if(i == 3) {
    			i++;
    			continue;
    		}
    		System.out.println(i);
    		i++;
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 0;
    	while (i <= 10) {
    		int count = 1; //1부터 카운트를 시작한다.
    		while(count <= i) {
    			System.out.print("*");
    			if (count == 5) {//만약 카운트가 다섯번째에 도착한다면 
    				break;// 조건문을 멈추고 싶다.
    			}
    			count++;
    		}
    		System.out.println();
    		i++;
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 0;
    	label1: { //라벨1 안에 묶고
	    	while (i <= 10) {
	    		int count = 1; //1부터 카운트를 시작한다.
	    		while(count <= i) {
	    			System.out.print("*");
	    			if (count == 5) {//만약 카운트가 다섯번째에 도착한다면 
	    				break label1;// 라벨1의 블록을 탈출하면 조건문을 멈추고 싶다.
	    			}
	    			count++;
	    		}
	    		System.out.println();
	    		i++;
	    	}
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 0;
    	label1: //라벨1 안에 묶고
    	while (i <= 10) {
    		int count = 1; //1부터 카운트를 시작한다.
    		while(count <= i) {
    			System.out.print("*");
    			if (count == 5) {//만약 카운트가 다섯번째에 도착한다면 
    				break label1;// 라벨1의 블록을 탈출하면 조건문을 멈추고 싶다.
    			}
    			count++;
    		}
    		System.out.println();
    		i++;
    	}
    	
    	System.out.println("--------------------------");
    	
    	i = 0;
    	while (i <= 10) {
    		int count = 2 * 1; //2 * 1부터 카운트를 시작한다.
    		while(count <= i) {
    			System.out.printf("%d");
    			if (count == 9 * 9) {//만약 카운트가 다섯번째에 도착한다면 
    				break;// 조건문을 멈추고 싶다.
    			}
    			count++;
    		}
    		System.out.println();
    		i++;
    	}
    	
    	System.out.println("--------------------------");
    }
}