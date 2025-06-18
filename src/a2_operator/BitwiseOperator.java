package a2_operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        // 비트연산자
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // 1101
        System.out.println(Integer.toOctalString(data)); // 15
        System.out.println(Integer.toHexString(data)); // d
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // 13
        System.out.println(Integer.parseInt("15", 8)); // 13
        System.out.println(Integer.parseInt("d", 16)); // 13
        System.out.println();

        System.out.println(13); // 13
        System.out.println(0b1101); // 13 이진수를 표기할때는 0b를 앞에 붙인다.
        System.out.println(015); // 13 8진수를 표기할때는 0을 붙인다.
        System.out.println(0xd); // 13 16진수를 표기할때는 0x를 붙인다.
        System.out.println();

        // &
        // 논리연산자(&&)와 다르게 & 한개를 사용한다.
        // 두개의 비트가 모두 1인경우에만 결과가 1
        System.out.println(3 & 10); // 2
        // 0000 0011 = 3
        // 0000 1010 = 10
        // --------------
        // 0000 0010 = 2

        // |
        // 두 비트 중 한개만 1이어도 결과가 1
        System.out.println(3 | 10); // 11
        // 0000 0011 = 3
        // 0000 1010 = 10
        // --------------
        // 0000 1011 = 11

        // ^
        // 두 비트가 다르면 1, 같으면 0
        // 0000 0011 = 3
        // 0000 1010 = 10
        // --------------
        // 0000 1001 = 9

        // ~ 비트연산자의 NOT은 논리연산자(!)와 다름
        // 모든 비트(부호비트 포함)의 값을 반대로 바꿈
        System.out.println(~3); // -4
        // 0000 0011 = 3
        // 1111 1100 = -4
        // ~ 연산자는 컴퓨터의 음수표현에 사용됨
        // N의 음수는 ~N + 1로 계산 가능하다.
        System.out.println(Integer.toBinaryString(-3)); // 1111 1101
    }
}
