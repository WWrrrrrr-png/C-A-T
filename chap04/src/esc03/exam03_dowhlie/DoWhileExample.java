package esc03.exam03_dowhlie;

import java.util.Scanner;

public class DoWhileExample { // 클래스명 오타 수정

    public static void main(String[] args) {
        // DoWhileExample 예제
        System.out.println("메시지를 입력하세요"); 
        System.out.println("종료하려면 q를 입력하세요"); // 'P' → 실제 조건에 맞춰 'q'로 수정

        // 사용자로부터 키보드 입력을 받게 하는 기능 제공
        Scanner scanner = new Scanner(System.in); 
        String inputString;

        do {
            System.out.print("> "); 
            inputString = scanner.nextLine(); // 사용자가 키보드로 입력한 값을 임시기억장소에 저장
            System.out.println(inputString);  // inputString에 저장된 값을 출력
        } while (!inputString.equals("q")); // 입력값이 "q"가 아니면 계속 반복

        System.out.println(); 
        System.out.println("프로그램 종료");

        scanner.close(); // 스캐너 닫기 (권장)
    }
}
