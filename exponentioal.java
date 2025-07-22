public class exponentioal {
    // public static void main(String[] args) {  // Normal method
    //     int p = 2, q = 3, prod = 1;
    //     for(int i = 1; i <= q; i++) {
    //          prod *= p;
    //     }
    //     for(int i = 1; i <= q; i++) {
    //         System.out.print(p+"X");
    //     }
    //     System.out.print("="+prod);
    // }


    public static void main(String[] args) {
        int p = 2, q = 3;
        int ans = pow(p, q);
        System.out.println(ans);
    }

    public static int pow (int p, int q) {
        if (q <= 1) return p;
        return p*pow(p,q-1);
    }

}
