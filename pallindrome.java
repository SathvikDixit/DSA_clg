public class pallindrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1};
        boolean soln = checkPall(arr);
        System.out.println(soln);
    }

    public static boolean checkPall(int[] arr) {
        if (arr == null || arr.length <= 1) return false;

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
