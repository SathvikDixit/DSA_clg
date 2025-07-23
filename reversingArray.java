import java.util.Arrays;

public class reversingArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7}; 
        int[] ans = revArr(arr1);
        System.out.println("" + Arrays.toString(ans));
    }

    public static int[] revArr(int[] arr1) {
        int n = arr1.length, i, j = n -1;
        for (i = 0; i < n/2; i++) {
            swap(arr1, i, j);
            j--;
        }
        return arr1;
    }

    public static void swap(int[] arr1, int i, int j) {
        int temp = arr1[j];
        arr1[j] = arr1[i];
        arr1[i] = temp;
    }
}
 