import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 7, 9};
        System.out.println("-----Array before insertion sorting-----");
        System.out.println(Arrays.toString(arr));
        Insertion(arr);
    }

    public static void Insertion(int[] arr) {
        int n = arr.length;
        for(int i = 0; i <= n-1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("-----Array after insertion sorting-----");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}
