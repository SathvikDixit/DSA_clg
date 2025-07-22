
import java.util.*;
public class duplicateInArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 3, 3, 3, 4};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 3) count++;
        }
        System.out.println(count);
    }
}
