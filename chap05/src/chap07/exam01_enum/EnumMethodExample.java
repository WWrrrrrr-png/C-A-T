package chap07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		// 열거형 타입 만들기
		// Week는 enum 타입이며, 그 안에는 정해진 상수들만 사용할 수 있음
		Week Thisday = Week.Saturday;  // Week 열거형에서 Saturday를 선택

		String name = Thisday.name(); // name(): 열거형 상수의 이름(문자열)을 반환
		System.out.println(name);     // 출력: "Saturday"

		System.out.println(Thisday);  // 열거형 상수 자체 출력 → toString()과 같음

		int ordinal = Thisday.ordinal(); // ordinal(): 열거형 상수의 순서(0부터 시작)
		System.out.println(ordinal);     // 출력: Saturday가 몇 번째에 선언되었는지

		// 문자열을 열거형 상수로 변환 (예: "Sunday" → Week.Sunday)
		Week weekDay = Week.valueOf("Sunday");

		// 열거형의 모든 값을 배열로 반환 (Week.values()는 모든 요일을 반환)
		Week[] days = Week.values();

		// 향상된 for문을 통해 모든 열거형 상수를 출력
		for (Week day : days) {
			System.out.println(day); // Sunday, Monday, ..., Saturday 출력
		}
	}
}

