public class countOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 5, 6, 9, 9, 9, 10};
        int target = 9;
        int ans = countOccr(arr, target);
        System.out.println(ans);
    }

    public static int countOccr(int[] arr, int target){
        int n = arr.length, count = 0;
        for (int i = 0; i < n; i++) {
            if(target == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
