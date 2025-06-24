package sec07.exam04_main_agument; 
// 패키지 선언: 이 클래스는 sec07.exam04_main_agument 패키지에 속함

public class MainStringArrayAgument {
    // 프로그램의 시작점인 main 메서드
    public static void main(String[] args) {
        
        // 프로그램 실행 시 전달된 인자의 수가 정확히 2개가 아닐 경우
        if(args.length != 2) { 
            System.out.println("프로그램 사용법"); // 사용법 안내 출력
            // 명령행에서 실행 시 전달해야 하는 예시 형식 (exe는 생략 가능)
            System.out.println("java.exe MainStringArrayAgument num1 num2");
            
            // 프로그램 강제 종료 (정상 종료 코드 0)
            System.exit(0); 
        }

        // 명령행 인자로 전달된 첫 번째 값을 문자열로 받아 저장
        String strNum1 = args[0];
        // 명령행 인자로 전달된 두 번째 값을 문자열로 받아 저장
        String strNum2 = args[1];

        // 문자열을 정수로 변환 (예: "10" → 10)
        int num1 = Integer.parseInt(strNum1); 
        int num2 = Integer.parseInt(strNum2); 

        // 두 숫자를 더한 결과 계산
        int result = num1 + num2; 

        // 결과 출력 (예: 10 + 20 = 30)
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
