package sec04.exam01_if;

public class IfElseIfElseExample {

    public static void main(String[] args) {

        int score = 75;

        // 1. 단순 if~else if 구조로 점수 출력
        if (score >= 90) {
            System.out.println("점수는 " + score + "점 : A등급");
        } else if (score >= 80) {
            System.out.println("점수는 " + score + "점 : B등급");
        } else if (score >= 70) {
            System.out.println("점수는 " + score + "점 : C등급");
        } else {
            System.out.println("점수는 " + score + "점 : D등급");
        }

        // 2. 결과를 문자열 변수에 저장
        String result = "";

        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else {
            result = "D";
        }

        System.out.println("학점: " + result);
    }
}
