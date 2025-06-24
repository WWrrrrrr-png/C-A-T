package sec06.exam07_main_agument; // 패키지 선언

public class AdancedForExample {

    public static void main(String[] args) {
        // 향상된 for문(Foreach문) 예제

        int[] scores = {95, 71, 84, 93, 87}; 
        // 정수형 배열 scores를 선언하고, 5개의 점수를 초기값으로 저장

        int sum = 0;
        // 총합을 저장할 변수 sum을 0으로 초기화

        // 향상된 for문을 사용하여 배열의 각 요소를 하나씩 가져와 합산
        for (int score : scores) {
            sum = sum + score; // score 값을 sum에 누적
        }

        System.out.println("합계: " + sum);
        // 총합 출력

        double avg = (double) sum / scores.length;
        // 평균을 구하기 위해 합계를 배열의 길이로 나누고, 소수점 표현을 위해 형 변환

        System.out.println("평균: " + avg);
        // 평균 출력
    }

}
