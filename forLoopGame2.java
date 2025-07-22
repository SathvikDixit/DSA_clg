import java.util.Scanner;

public class forLoopGame2 {
    // public static void main(String[] args) {
    // int n = 5;
    // for(int i = 0; i < n; i++) {
    // for(int j = 0; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }
    /*
     * *
     **
     ***
     ****
     *****
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (64 + j));
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
