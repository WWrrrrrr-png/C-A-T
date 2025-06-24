package esc06.exam01_array_byltst;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 참조형 데이터 array 
		
				int[] scores; //스택영역에만 기억장소가 생성//데이터가 생성이 아니라 주소를 참조//초깃값은 null 참조x
				scores = new int[] {83,90,87};//힙영역에 데이터가 생성.생성된 주소가 대입 스택에
				int sum1 = 0; 
				for(int i=0; i<scores.length; i++) {
					sum1 += scores[i];
				}
				System.out.println("총합 : " + sum1);
				int sum2 = add(new int [] {83,90,87});
				
				System.out.println("총합 : " + sum2);
				
				int sum3 = add(new int [] {100,87,97,88}); 
				System.out.println("총합 : " + sum3); 
				System.out.println();
	}

		//메서드 선언:1. 기능을 생성2. 클래스 안에서 선언
	public static int add(int[] scores) {
		int sum = 0; 
		for(int i=0; i<scores.length; i++) {
		
		 sum += scores[i]; 
		 
		}
		return sum; 
	
	}
	
}
