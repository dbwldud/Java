package a2_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자 (&&, ||, ^, !)
        // 발음은 순서대로 앰퍼샌드, 파이프, 캐럿, 니게이션
        // ampersand, pipe, caret, negation(=not)

        // AND 논리연산자
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        System.out.println(true && (5<3)); // false
        System.out.println((5<=5) && (7>2)); // true
        System.out.println();

        // OR 논리연산자
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false
        System.out.println(false || (5<3)); // false
        System.out.println((5<=5) || (7>2)); // true

        // NOT
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println();


        // XOR (exclusive OR 배타적논리합)
        // 두개의 값이 다르면 true(=1), 같으면 false (=0)
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // 실제예시 1) NOT연산자의 사용법
        // 보통 토글장치를 구현할 때 사용함
        boolean capsButton = false;
        capsButton = !capsButton;
//        if (capsButton == true) {
//            capsButton = false;
//        }else {
//            capsButton = true;
//        }

        // 실제예시 2) XOR연산자의 사용법
        // 기본적인 암호화 / 복호화 구현에 사용됨
        // step1 보내려는 문자와 키를 이진수로 변환
        // 보내려는 문자 'A', 키는 숫자 7
        // 0100 0011 = 'A'
        // 0000 0111 = 7
        // --------------
        // 0100 0110 = 암호화된 데이터
        // 0000 0111 = 키
        // ---------------
        // 0100 0001 = 'A' 복호화 성공
    }
}
