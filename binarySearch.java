public class binarySearch {
    public static int binSearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        if(arr == null || arr.length == 0)  {
            System.out.println("Btch yo array is empty ");
            return -1;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) return mid;
            else if (target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {  };
        int target = 6;
        int ans = binSearch(arr, target);
        System.out.println("The target element is present at index "+ans);
    }
}
