public class findMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {5, 1, 999, 3, -1, 0};
        maxMin(arr);
    }
    public static void maxMin (int[] arr) {
        // int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // for (int i = 0; i < n; i++) {
        //     if(arr[i] > max) max = arr[i];
        //     if(arr[i] < min) min = arr[i];
        // }
        for(int i : arr) {
            if(i > max) max = i;
            if(i < min) min = i;
        }
        System.out.println("Maximum value is "+max);
        System.out.println("Minimum value is "+min);
    }
}
