package sec04.exam01_if;

public class ForSumFromExample2 {

	public static void main(String[] args) {
		//1~100까지 누적된 값을 구하라
		// 지역 변수는 초기화 
		int sum =0; 
		
		for(int i=1; i<100; i++) {
			sum += i; //sum= sum +i
			
			
		}
		System.out.println("1~100" + sum );
	}

}
