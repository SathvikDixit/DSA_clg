import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {95, 88, 12, 1, 22, 69, 96};
        int n = arr.length;
        System.out.println("array before sorting "+Arrays.toString(arr));
        int[] ans = sort(arr, n);
        System.out.println("after sorting : "+Arrays.toString(ans));
    }

    public static int[] sort(int arr[], int n) {
        for(int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i; j < n; j++) {
                if(arr[j] < arr[mini]) mini = j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        // for(int i = 0; i<n; i++) {
        //     System.out.println("Array after sorting "+arr[i]);
        // }
        // System.out.println();
        return arr;
    }
}
