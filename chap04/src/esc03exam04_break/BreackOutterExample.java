package esc03exam04_break;

public class BreackOutterExample {

	public static void main(String[] args) {
		//A=65 Z=96   
	//Outer레이블 이름으로 종료 시킬 수있다	
	 Outer:for(char upper = 'A'; upper <= 'z'; upper++) {
			for(char lower ='a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-"+lower+"\t"); 
				if(lower == 'g') {
					break Outer;//for문에서 종료
				}
			}
			System.out.println();
		}

	}

}
