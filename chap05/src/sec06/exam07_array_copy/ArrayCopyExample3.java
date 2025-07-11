package sec06.exam07_array_copy;

public class ArrayCopyExample3 {

    public static void main(String[] args) {
        // 원본 배열
        String[] oldStrArray = {"JAVA", "ARRAY", "COPY"};
        String[] newStrArray = new String[5];

        // 배열 복사 (직접 for문으로)
        for (int i = 0; i < oldStrArray.length; i++) {
            newStrArray[i] = oldStrArray[i];
        }

        // 사본 배열 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ",");
        }
    }
}
