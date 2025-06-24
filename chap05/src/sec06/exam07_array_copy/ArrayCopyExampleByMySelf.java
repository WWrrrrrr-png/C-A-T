package sec06.exam07_array_copy;
import java.util.Arrays;
public class ArrayCopyExampleByMySelf {

    public static void main(String[] args) {
        // 원본 배열
        String[] oldArray = {"JAVA", "ARRAY", "COPY"};
        String[] newArray = new String[5];

        System.arraycopy(oldArray,0,newArray,0,oldArray.length); 
        
        System.out.println(Arrays.toString(newArray));
        
        
    }
}
