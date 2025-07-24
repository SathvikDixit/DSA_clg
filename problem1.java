// HackerRank CTC technical quesitons

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number the array elements to be printed and x value: ");
        int arrSize = sc.nextInt();
        int x = sc.nextInt();
        int sum = 0;
        int[] arr1 = new int[arrSize];
        int[] arr2 = new int[arrSize];
        
        for (int i = 0; i < arrSize; i++) {
            arr1[i] = i + 1;
        }

        for (int i = 0; i < arrSize-1; i++) {
            arr2[i] = arr1[i] + arr1[i+1];
        }
        arr2[arrSize-1] = arr1[0] + arr1[arrSize-1];

        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));

        for(int i = 0; i < arrSize; i++) {
            if(arr2[i]%x == 0) {
                sum += arr2[i];
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
