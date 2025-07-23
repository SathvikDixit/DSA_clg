// I've written in using binary search it can also be done in liner search(for loop).

public class firstOccurance {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40};
        int target = 50;
        int soln = firstOccr(arr, target);
        System.out.print("The target "+target+" is found in "+soln);
    }

    public static int firstOccr(int[] arr, int target) {
        int low = 0, high = arr.length-1;

        while(low <= high) {
            int mid = (low+high)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
