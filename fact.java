import java.util.Scanner;

public class fact {

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Sum of first "+n+" numbers are: ");
        factorial(n);
        sc.close();
    }

    public static void factorial(int n) {
        int sum = 0;
        sum += n*(n-1)/2;
        System.out.println(sum);
    }*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println("Factorial of "+n+ " is: "+result);
        sc.close();
    }

    public static int factorial(int n) {
        if(n == 1) return 1;
        // System.out.print(n + " ");
        return n * factorial(n - 1);
    }
}
