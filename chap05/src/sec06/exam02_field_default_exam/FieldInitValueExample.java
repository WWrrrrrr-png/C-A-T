package sec06.exam02_field_default_exam;

public class FieldInitValueExample {

    public static void main(String[] args) {
        // 객체 생성: FieldInitValue라는 클래스로 기억장소(객체)를 만든다
        FieldInitValue fv = new FieldInitValue();

        System.out.println("byteField: " + fv.byteField);
        System.out.println("longField: " + fv.longField);
        System.out.println("intField: " + fv.intField);
        System.out.println("booleanField: " + fv.booleanField);
        System.out.println("charField: '" + fv.charField + "'"); // ''로 구분해서 출력
        System.out.println("floatField: " + fv.floatField);
        System.out.println("doubleField: " + fv.doubleField);
        System.out.println("arrField" + fv.arrField); 
        System.out.println("referenceField" + fv.referenceField);
    }
}
