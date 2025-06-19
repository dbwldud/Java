package a2_operator;

public class Example {
    public static void main(String[] args) {
        // 연습문제
        // Q3
        // 0000 0011 = 3
        // 0000 0101 = 5
        // -------------
        //&0000 0001
        //|0000 0011
        //^0000 0110
        //~1111 1010

        // Q4
        System.out.println(Integer.toBinaryString(-7));
        // 1111 1001 = -7 >> 2
        // 1111 1110 = -2

        // Q8
        // 0000 0110 = 6
        // 0000 0101 = 5
        // ------------- &
        // 0000 0100 = 4

        // Q9
        int a = 3;
        int b = 5;
        int c = 7;
        System.out.println((a > b) ? "안녕하세요" : "반갑습니다");
        System.out.println((a < b) ?((b > c) ? "타입 A" : "타입 B") : ((b < c)? "타입 C" : "타입 D"));
        System.out.println((a < b) ? "타입 B" : "타입 D");
    }
}
