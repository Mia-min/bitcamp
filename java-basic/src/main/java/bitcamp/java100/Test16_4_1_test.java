package bitcamp.java100;

public class Test16_4_1_test {

 public static void main(String[] args) {
 	int i = 2;
 	while (i <= 9) {
 	 int j = 1;
 	 while (j <= 9) {
		System.out.printf("%d * %d = %d\n", i, j, (i*j));
 		j++;
 	 }
 	i++;
 	}
 	
 	System.out.println("--------------------------");
 	
 	i = 987654321; // i가 987654321일 때
	while(i > 0) { 
		System.out.printf("%d", i % 10);
		i /= 10;
	}
	
	System.out.println("--------------------------");
	
	i = 4885323;
	int[] cnt = new int[10];

	while(i > 0) { 
		cnt[i % 10]++;
		i /= 10;
	}
	int x = 0;
	while (x < cnt.length) {
		System.out.printf("%d = %d\n", x, cnt[x]);
		x++;
	}
 }
}

 