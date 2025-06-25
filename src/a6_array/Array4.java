package a6_array;

public class Array4 {
    public static void main(String[] args) {
        // 반복문을 사용한 배열의 순회

        // 배열의 길이
        int[] numbers = {3,4,5,6,7};
        System.out.println("배열의 길이=" + numbers.length);
        // 배열의 순회
        // 방법1
        for (int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // 방법2 (추천!!)
        for (int data : numbers) {
            System.out.println(data);
        }

        // 연습예제
        String[] colors = {"black","white","blue","red","green"};
        for (String data : colors) {
            System.out.println(data);
        }
        
    }
}
