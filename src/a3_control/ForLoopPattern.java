package a3_control;

public class ForLoopPattern {
    public static void main(String[] args) {
        // 1. sum : 반복문에서 합계를 저장하는 역할 변수 사용
        // 1부터 10까지 숫자를 더하는 코드
        int sum = 0;
        System.out.println("sum = " + sum);
        for (int i=1; i<11; i++) {
            System.out.println("i = " + i); // i = ?
            sum = sum + i;
            System.out.println("sum = " + sum); // sum = ?
        }
        System.out.println("총합은 = " + sum);
        System.out.println();

        // 2. count : 반복문에ㅔ서 특정조건에 맞는 경우의 세는 변수 사용
        // 짝수의 갯수를 세는 코드
        int count = 0;
        for (int i=0; i<10; i++) {
            System.out.println("1 = " + i); // i = ?
            if (i % 2 == 0) { // 짝수확인조건

                System.out.println("count = " + count); // count = ?
            }
        }
    }
}








































