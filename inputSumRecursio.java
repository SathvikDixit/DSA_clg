public class inputSumRecursio {
    public static void main(String[] args) {
        int n = 6996;
        int ans = rec (n);
        System.out.println(ans);
    }
    public static int rec (int n) {
        if (n <= 0) return 0;
        int sum = n%10;
        return sum + rec(n/10);
    }
}
