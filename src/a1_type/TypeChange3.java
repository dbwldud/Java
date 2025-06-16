package a1_type;

public class TypeChange3 {
    public static void main(String[] args) {
        // 기본자료형간의 연산
        int value1 = 3 + 5; // 8 int + int = int
        int value2 = 8 / 5; // 1 int / int = int
        // int 포함 그 아래에 있는 byte, short 사이의 연산은 모두 int

        float value3 = 3.0F + 5.0F; // 8.0 float + float
        double value4 = 8.0 / 5.0; // 1.5 double / double

        byte data1 = 3;
        byte data2 = 5;
        //byte value = data1 + data2; // 에러발생. int + int이므로 byte에 저장불가
        int value5 = data1 + data2; // 8

        //int value6 = 3 + 3.5;
        // 에러. int + double => int를 업캐스팅해서 double + double
        // int에 담을 수 없음
        double value6 = 3 + 3.5; // 6.5
        // 굳이 int에 담고자한다면,
        int value7 = 3 + (int)3.5; // 6
        System.out.println(value7);

        double value8 = 5 / 2.0; // 2.5 double / double
        byte data3 = 3;
        short data4 = 5;
        int value9 = data3 + data4; // int + int
        // byte와 short 타입으로는 연산을 수행하지 않음. int로 업캐스팅해서 연산.
        System.out.println(value9); // 8
        double value10 = data3 + data4; // double + double
        System.out.println(value10); // 8.0
    }
}