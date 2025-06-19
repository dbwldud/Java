package a3_control;

public class Ch4_Example {
    public static void main(String[] args) {
        // Q1
        int score = 72;
        if (score >= 80 && score < 90) { // 80 <= score < 90
            System.out.println("B학점");
        }else if (score >= 90) { // socre >= 90
            System.out.println("A학점");
        }else if (score >= 70 && score < 80) { // 70 <= score < 80
            System.out.println("C학점");
        }else {
            System.out.println("F학점");
        }

        // Q2
        // switch case문은 범위조건을 구현하기에 적합하지 않음
        // 그래서 점수를 10을 나눠서 앞자리로 구분하는 방법을 사용함
        switch (score/10) {
            case 10:
            case 9:
                System.out.println("A학점"); break;
            case 8:
                System.out.println("B학점"); break;
            case 7:
                System.out.println("C학점"); break;
            default:
                System.out.println("F학점");
        }

        // Q3
        for (int i=0; ; i++) {
            if (i > 10) {
                break;
            }
            if (i % 2 == 1) { // 홀수
                continue;
            }
            System.out.print(i + ", ");
        }

        // Q4
//        for (int i=10; i>0; i-=2) {
//            System.out.println(i);
//        }
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i -= 2;
        }

        // Q5
        for (int i=0; i<5; i++) {
            for (int j=0; j<3; j++) {
                if (i == 2) {
                    continue;
                }
                if (j == 1) {
                    break;
                }
                System.out.println("A");
            }
        }

        // Q6
        for (int i=0; i<10; i++) {
            for (int j=0; j<5; j++) {
                if (i == 3 && j == 2) {
                    i = 999;
                    break;
                }
            }
        }

        // Q7 레이블
        out:
        for (int i=0; i<10; i++) {
            for (int j=0; j<5; j++) {
                if (i == 3 && j == 2) {
                    break out;
                }
            }
        }
    }
}































