package esc06.exam05_array_in_array;

public class ArrayInArrayExample {

    public static void main(String[] args) {
        // 2차원 배열 생성 (2행 3열) 
    	//기본형 데이터 타입 예제: int[] int [][]
        int[][] mathScores = new int[2][3]; // 자동 초기화: 0

        // 첫 번째 행 (행 인덱스: 0)
        mathScores[0][0] = 1;
        mathScores[0][1] = 2;
        mathScores[0][2] = 3;

        // 두 번째 행 (행 인덱스: 1)
        mathScores[1][0] = 4;
        mathScores[1][1] = 5;
        mathScores[1][2] = 6;

        // 출력 및 합계 계산
        System.out.println("=== mathScores 출력 ===");
        int total = 0;
        for (int i = 0; i < mathScores.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < mathScores[i].length; j++) {
                rowSum += mathScores[i][j];
                System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
            }
            System.out.println("mathScores 행 " + i + "의 합계: " + rowSum);
            total += rowSum;
        }
        System.out.println("전체 총합: " + total);

        // 가변 배열 생성
        int[][] englishScore = new int[2][];
        englishScore[0] = new int[2]; // 첫 번째 행: 2열
        englishScore[1] = new int[3]; // 두 번째 행: 3열

        // 값 대입
        englishScore[0][0] = 10;
        englishScore[0][1] = 20;
        englishScore[1][0] = 30;
        englishScore[1][1] = 40;
        englishScore[1][2] = 50;

        // 출력 및 합계 계산
        System.out.println("=== englishScore 출력 ===");
        for (int i = 0; i < englishScore.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < englishScore[i].length; j++) {
                rowSum += englishScore[i][j];
                System.out.println("englishScore[" + i + "][" + j + "] = " + englishScore[i][j]);
            }
            System.out.println("englishScore 행 " + i + "의 합계: " + rowSum);
        }
    }
}
