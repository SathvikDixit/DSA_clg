
public class Resursion {
    public static void main(String[] args) {
        // recursion(5);
        System.out.print("descending: ");
        printDescending(5);
    }

   /* public static void recursion(int n) {
        if(n == 0) {
            return;
        }
        // System.out.println(n);  // Printing in Descending order
        recursion(n-1);
        System.out.println(n);  // Printing in Ascending order
    } */




    public static void printDescending(int n) {
        if ( n == 0) {
            return ;
        }
        System.out.print(n + " ");
        printDescending(n - 1);
        System.out.print(n + " ");
    }
}
