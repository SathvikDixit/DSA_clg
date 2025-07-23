import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 2, 7, 0, 7, 5, 2, 6};
        bubble(arr);
    }
    public static void bubble(int[] arr) {
        int n = arr.length, i;
        int j;
        for (i = 0; i < n-1; i++) {
            System.out.println("The "+(i+1)+" iteration is: "+Arrays.toString(arr));
            int swapped = 0;
            for(j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = 1;
                }
            }
            if (swapped == 0) break;
        }
        for(int a = 0; a < n; a++) {
            System.out.print(arr[a]+" ");
        }
    }
}
