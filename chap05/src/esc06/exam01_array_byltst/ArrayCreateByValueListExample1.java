package esc06.exam01_array_byltst;

public class ArrayCreateByValueListExample1 {

    public static void main(String[] args) {
        // 참조형 데이터 타입 배열: 동일한 데이터 타입으로 구성하여, 연속적으로 이루어진 기억장소

        // 기본 데이터 타입: 스택 영역에 저장
        int score1 = 83;
        int score2 = 90;
        int score3 = 87; 
        int score4 = 89;
        int score5 = 90;
        // 여백 또는 구분선 출력용
        String space = "-------";
        

        // 참조타입: 스택은 주소, 힙은 실제 데이터 
        //유지보수 용이  
        int[] scores = {83, 90, 87,89,90};

        // 각각 출력
        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
		
        System.out.println(space);
        
		System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]); 
        System.out.println(scores[4]); 
        
        
        System.out.println(space);
        
        System.out.println("5개의 합은? = " + (score1 + score2 + score3+score4+score5));

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println("3개의 합은 ? = " + sum); 
        
        System.out.println(space); 
        
        double avg = (double)sum/scores.length;//
        System.out.println("평균" + avg);
        
    }




}

