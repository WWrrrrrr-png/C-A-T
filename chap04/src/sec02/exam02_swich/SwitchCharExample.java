package sec02.exam02_swich;

public class SwitchCharExample {

	public static void main(String[] args) {
		// 변수를 char 데이터 타입
        //입력후 반드시 테스트 각각의 동작하는 코드마다 동작을 확인 
		char grade = 'A'; 
		
		switch(grade) {
		 //switch문 축약
		case 'A': 
		case 'a': 
			
			System.out.println("우수 회원입니다."); 
			break; 
			
		case'B': 
		case'b': 
			System.out.println("일반 회원 입니다."); 
			break; 
			
		default: 
			System.out.println("손님 입니다.");
			
		}
		
	}

}
