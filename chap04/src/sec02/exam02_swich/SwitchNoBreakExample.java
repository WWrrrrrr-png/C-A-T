package sec02.exam02_swich;

public class SwitchNoBreakExample {

	public static void main(String[] args) {
		// 시간에 따른 각각의 직원의 상테를 변경
		//오전 8시 출근~9시 회의 ~10업무중.기타:외근나감
		//8시~12시 범위의 랜덤값(기억) 
		int time =(int)(Math.random()*4)+8;
		
		switch (time) {
		case 8: 
			System.out.println("출근합니다."); 
			
		case 9:  
			System.out.println("회의를 합니다.");  
		case 10:  
			System.out.println("업무를 합니다.");  
		defualt:  
			System.out.println("외근 합니다."); 
		
		}
	
	}

}
