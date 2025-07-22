public class inputSumRecursio {
    public static void main(String[] args) {
        int n = 16996;
        int ans = rec (n);
        System.out.println(ans);
    }

    public static int rec (int n) {
        if (n <= 0) return 0;
        int sum = n%10;    // n % 100 for two digits
        return sum + rec(n/10);   // n/100 for two digits
    }
}
