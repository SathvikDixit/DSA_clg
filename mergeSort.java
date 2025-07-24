import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 4, 0, 3, 8, 2};
        System.out.println("Array before sorting: "+Arrays.toString(arr));
        int n = arr.length;
        int l = 0;
        int r = n-1;
        mergeSoort(arr, l, r);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSoort(int[] arr, int l, int r) {
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSoort(arr, l, mid);
        mergeSoort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = arr[l+i];
        for (int i = 0; i < n2; i++) right[i] = arr[mid+1+i];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if(left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++] ;
        }
    }
}
