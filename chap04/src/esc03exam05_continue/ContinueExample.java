package esc03exam05_continue;


public class ContinueExample {

    public static void main(String[] args) {
         
        for (int i = 1; i < 10; i++) {
            // i의 값이 2의 배수가 아니면 반복문 건너뜀
            if (i % 2 != 0) {
            	 System.out.println(i); // 2, 4, 6, 8 출력
            }
           
        }

    }
}

