package chap05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// 참조타입:배열,열겨형,클래스,인터페이스 
		//클래스: string 문자열 데이터를 다루기위해 제공   
		//문자열 작업은 부조건 string class 기본
		//⬇첫번째 타입: 값 타입 처럼 사용 힙 영역에서 
		String strVar1="김카타리나"; 
		String strVar2="김카타리나"; 
		
		//strVar1변수의 주소와strVar2 주소가 일치 
		if(strVar1 == strVar2) {
			
			System.out.println("strVar1과strVar2 참조가 같음");
		}else {
			System.out.println("strVar1과strVar2 참조가 다름");
		}
		
		 
		//strVar1변수와 strVar2변수의 데이터 자체를 비교  
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과strVar2은 문자열이 같음");
		} 
		
		//필드에서 많이 사용하는 string 참조타입 데이터 
		//참조타입 사용법의 기본은 class 명변수 = new 생성자();
		String strVar3 = new String("catarina kim");//생성자 (메서드) 
		String strVar4 = new String("catarina kim"); //힙영역에 "catarinakim" 이라는 주소 영역이 각각 사용
		 String strVar5 = "-----"; 
		 System.out.println();
		
		System.out.println(strVar1 + strVar4);
		//strVar1변수의 주소와strVar2 주소가 일치x
		if(strVar1 == strVar2) {
			
			System.out.println("strVar3과strVar4 참조가 같음");
		}else { 
			System.out.println();
			System.out.println("strVar3과strVar4 참조가 다름");
		}
		
		 
		//strVar1변수와 strVar2변수의 데이터 자체를 비교  
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과strVar4은 문자열이 같음");
		} 
	
	
	} 

}
