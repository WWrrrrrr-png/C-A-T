package sec04.exam01_if;

public class IfNestedExample {

    public static void main(String[] args) {
        int score = (int)(Math.random() * 20) + 81; // 81~100 랜덤
        String grade;

        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (score >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }

        System.out.println("점수: " + score);
        System.out.println("등급: " + grade); 
    }
}
