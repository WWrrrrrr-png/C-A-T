package esc03exam05_continue;

public class ContinueExamplecopy {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) { 
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i); // 짝수만 출력
        }
    }
}
