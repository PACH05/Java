package javaDSA.otherAlgorithms.binarySearch;

// Search the position in which the target element can be inserted in the given sorted array

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int target = 5;
        int ans = searchInsertPosition(arr, target);
        System.out.println(ans);
    }

    private static int searchInsertPosition(int[] arr, int target) {
        int n = arr.length;
        int low = arr[0];
        int high = arr[n - 1];

        while(low <= high){
            int mid = low + (high - low)/2;

            if(target>arr[mid - 1]&& target<arr[mid+1]){
                return mid;
            }else if(target > arr[mid]) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return 0;
    }
}
