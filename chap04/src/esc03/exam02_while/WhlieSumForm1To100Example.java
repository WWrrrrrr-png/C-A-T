package esc03.exam02_while;

public class WhlieSumForm1To100Example {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                int result = j * i;
                if (result % 2 != 0) {
                    continue; // 홀수는 건너뜀
                }
                System.out.print(j + "*" + i + "=" + result + "\t");
                sum += result; // 짝수 결과 누적
            }
            System.out.println(); // 줄바꿈
            
        }

        System.out.println("\n1~100까지의 짝수 곱셈 결과의 합: " + sum);
    }
}



