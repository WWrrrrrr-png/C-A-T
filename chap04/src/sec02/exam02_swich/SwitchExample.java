package sec02.exam02_swich;

public class SwitchExample {

	public static void main(String[] args) {
		// switch 
		int num = (int)(Math.random() * 6) + 1; 
		
		switch(num) { 
		  case 1:  
			  System.out.println("1번이 출력됨");  
			  break;  
			  
		  case 2:  
			  System.out.println("2번이 출력됨");  
			  break;  
		  
		  case 3:  
			  System.out.println("3번이 출력됨");  
			  break;  
		  case 4:  
			  System.out.println("4번이 출력됨");  
			  break;  
		  case 5:  
			  System.out.println("5번이 출력됨");  
			  break;  
		  default://마지막 case 의미로 사용  
			  System.out.println("6번이 출력됨");  
			  break; 
		  
		}

	}

}
