public class checkDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        boolean asdf = checkDupe(arr);
        System.out.println(asdf);
    }
    public static boolean checkDupe(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j] && i != j) return true;
            }
        }
        return false;
    }
}
