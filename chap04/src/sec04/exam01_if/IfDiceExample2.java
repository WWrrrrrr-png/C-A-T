package sec04.exam01_if;

public class IfDiceExample2 {
    public static void main(String[] args) {
                       //0.0 이상 ~ 1.0 미만의 실수 반환 (예: 0.2394…) 
    	//int num = ((int) Math.random() * 6) + 1;
        int num = (int)(Math.random() * 6) + 1;

        if(num == 1) {
            System.out.println("1번이 출력됨");
        } else if (num == 2) { 
            System.out.println("2번이 출력됨");
        } else if (num == 3) {
            System.out.println("3번이 출력됨");
        } else if (num == 4) { 
            System.out.println("4번이 출력됨");
        } else if (num == 5) { 
            System.out.println("5번이 출력됨");
        } else {
            System.out.println("6번이 출력됨");
        }
    }
}
