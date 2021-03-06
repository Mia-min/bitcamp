// ## 문자 코드 값을 저장할 변수 
// - 문자를 메모리에 저장하는 방법을 알아보자!
//

package bitcamp.java100;

public class Test12_9 {

    public static void main(String[] args) {
// 문자를 저장할 변수 준비하기
// => 자바는 유니코드를 사용하여 문자를 표현하기 때문에 유니코드를 저장할 2바이트 메모리가 필요하다.
// => 문자 코드이기 때문에 0 ~ 65535까지의 수를 저장할 수 있어야 한다.
        char c1; // short와 다른 점은 0 ~ 65535까지 저장한다는 점이다.

// => 문자를 저장하려면 그 문자의 유니코드 값을 저장하면 된다.
        c1 = 44032; // 유니코드 값을 10진수로 표현해도 되고,
        char c2 = 0xAC00; // 16진수로 표현해도 된다.

        System.out.println(c1);
        System.out.println(c2);

// => 자기 이름을 저장하기
        char n1 = 0xC5C4, n2 = 0xC9C4, n3 = 0xC601;
        System.out.printf("%c %c %c\n", n1, n2, n3);

// => 문자를 메모리에 저장할 때 마다 그 문자의 유니코드를 알아내는 것은 무척 힘든 것이 현실이다. 자바는 이것을 도와주기 위해 특별한 연산자를 제공한다. 즉 문자의 유니코드 값을 알아내는 연산자이다.
        n1 = '홍'; // 작은 따옴표는 해당 글자의 유니코드 값을 리턴한다.
        n2 = '길'; 
        n3 = '동';
        System.out.printf("%c %c %c\n", n1, n2, n3);

// => 문자 '7'을 숫자 7로 바꿔라!
        char x = '7';
        int num;
        num = x - '0';
        System.out.println(num);


    }
}
