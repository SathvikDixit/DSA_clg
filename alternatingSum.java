public class alternatingSum {
  /*   public static void main(String[] args) {
        int n = 8;
        int ans = sumOfDig(n);
        System.out.println(ans);
    }

    public static int sumOfDig(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i %2 != 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }  */


    public static void main(String[] args) {
        int n = 8;
        int ans = alternateSum(n);
        System.out.println(ans);
    }
    public static int alternateSum(int n) {
        if (n == 1) return 1;

        if(n %2 != 0) return n + alternateSum(n-1);
        else return -n + alternateSum(n-1);
    }
}
