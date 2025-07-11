package sec06.exam07_array_copy;

public class ArrayCopyExample {

    public static void main(String[] args) {
        // 원본 배열
        int[] oldStrArray = {1, 2, 3};

        // 사본 배열 (5칸짜리)
        int[] newStrArray = new int[5];

        // 배열 복사
        for (int i = 0; i < oldStrArray.length; i++) {
            newStrArray[i] = oldStrArray[i];
        }

        // 사본 배열 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + " ,");
        }
    }
}
