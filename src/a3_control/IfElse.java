package a3_control;
import java.util.Scanner; // 외부라이브러리를 사용하려면 먼저 import해야 함!!

public class IfElse {
    public static void main(String[] args) {
        // if 조건문(선택제어문)
        int a = 10;
        // if문의 기본형태1 : if() {}
        if (a>5) { // 조건이 거짓이면 실행되는 코드가 없음
            System.out.println(a);
        }
        // if문의 기본형태2 : if() {} else {}
        if (a>5) {
            System.out.println(a);
        } else {
            System.out.println("조건은 거짓");
        }
        // if문의 기본형태3 : if() {} else if() {} else {}
        // 나이를 입력하면 연령대를 출력하는 조건문
        // 나이 입력을 동적(=유저입력)으로 하기 위해 외부라이브러리가 필요함!
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력해주세요: ");
        int userAge = scanner.nextInt();
        if (userAge >= 20 && userAge <= 29) {
            System.out.println("20대");
        }
        else if (30 <= userAge && userAge <= 39) {
            System.out.println("30대");
        }
        else if (userAge >= 40 && userAge <=49) {
            System.out.println("40대");
        }
        else {
            System.out.println("나머지");
        }
        scanner.nextLine(); // Scanner가 가지고 있는 엔터버퍼를 비워주는 역할

        // 이름 입력
        System.out.println("이름을 입력해주세요: ");
        String userName = scanner.nextLine();
        System.out.println(userName);
        System.out.println("끝");
        scanner.close(); // 스캐너 객체를 메모리에서 삭제시킴
    }
}
