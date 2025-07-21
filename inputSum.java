// /Sum of digits

import java.util.Scanner;

public class inputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int ans = sumOfDig(n);
        System.out.println("Sum of "+n+" is "+ans);
        sc.close();
    }

    static int sumOfDig(int n) {
        int a = 0;
        while (n != 0) {
            int dig = n % 10;
            a += dig;
            n = (n / 10);
        }
        return a;
    }
}