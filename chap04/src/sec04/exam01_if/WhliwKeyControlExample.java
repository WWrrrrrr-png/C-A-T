package sec04.exam01_if;

import java.io.IOException;

public class WhliwKeyControlExample {

	public static void main(String[] args) throws Exception {
		// 1번을 입력 하면 증속 2번을 누르면 감속 3번을 누르면 정지 
		
		boolean run = true; 
		int speed = 0; 
		
		int keyCode = 0; //사용자의 입력값 ASCI코드
						 // 1번의 키값= 49 2번의 키값=50 3번의 키값=51 
		
		while(run) { 
			if(keyCode !=13 && keyCode != 10 ) {
				System.out.println("--------------"); 
				System.out.println("1.증속 |2.감속 |3.정지"); 
				System.out.println("------------------");
				System.out.println("선택:");
			
			}
               //in 속성은 유저가 입력 할수있는 속성	> 입력 후 >임시저장소에 전달 >리드메세지출력 
			//버퍼라는 임시기억저장소에 저장된다 .임시기억장소에서 저장된 값을 하나 읽어 온다 
			//숫자 키 1을 입력을 하고 엔터를 치면, 임시 기억장소에는 1의 아스키코드 값 49 
			//엔터값 10+13 
			//임시기억장소가 비워져 있으면 ,키를 입력할 수 있는 환경을 제공
			keyCode = System.in.read(); //read 매서는 게
			System.out.println("임시기억장소에 읽은 코드값: " + keyCode);
			    //키를 
			if (keyCode == 49) {
				speed++; 
				System.out.println("현재속도="+ speed); 
				
			} else if(keyCode == 50) { 
				speed--; 
				System.out.println("현재속도=" + speed);
				
			}else if(keyCode == 51) {
				run = false;
			}
			System.out.println("프로그램 종료");
		}
	}

}
