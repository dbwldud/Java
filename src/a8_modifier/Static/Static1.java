package a8_modifier.Static;

class A {
    int m = 3; // 인스턴스 필드
    static int n = 5; // 스태틱 필드 (=정적필드)
}

public class Static1 {
    public static void main(String[] args) {
        A a1 = new A(); // 인스턴스화, 객체화
        System.out.println(a1.m); // 3
        System.out.println(a1.n); // 5

        // 정적필드 직접 읽기
        // System.out.println(A.m); // 오류
        System.out.println(A.n); // 5

        // 정적필드 수정
        A.n = 6;
        System.out.println(a1.n); //
        System.out.println(A.n); // 
    }
}
