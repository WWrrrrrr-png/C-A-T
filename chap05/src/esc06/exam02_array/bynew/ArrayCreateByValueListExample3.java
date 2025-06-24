package esc06.exam02_array.bynew;

public class ArrayCreateByValueListExample3 {

    public static void main(String[] args) {

        // 🔸 int 배열: 기본형 (4바이트), 힙에 값 저장 
    	//자바.exe가 실행되어 jvm 을 동작을 시키고 
        int[] arr1 = new int[3]; // 스택에 arr1, 힙에 [0, 0, 0] (자동 초기화)
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]); // 0으로 초기화됨
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }

        // 🔸 double 배열: 실수형 (8바이트), 힙에 값 저장
        double[] arr2 = new double[3]; // [0.0, 0.0, 0.0]
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }

        arr2[0] = 1.1;
        arr2[1] = 2.2;
        arr2[2] = 3.3;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }

        // 🔸 String: 참조 타입 (스택에는 주소, 힙에는 객체)
        String str1 = "개피곤";
        String str2 = "ㅈㄴ피곤";
        String str3 = "취업";
        // 위 3개는 같은 문자열 리터럴 "편입"을 공유함 (JVM의 문자열 상수 풀 활용)

        // 🔸 String 배열: 참조형 배열 (초기값은 null)
        String[] arr3 = new String[3]; // 힙에 [null, null, null] 생성
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]); // null
        }

        arr3[0] = "아";
        arr3[1] = "아";
        arr3[2] = "아"; // 각 요소에 문자열 객체 참조 대입

        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
    }
}

