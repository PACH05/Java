package javaDSA.otherAlgorithms.binarySearch;

// Search in a rotated sorted array
public class SearchInARotSortArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,0,1,2,3};
        int target = 0;
        System.out.println(searchEle(arr, target));
        
    }

  //Method to search the element, return the index of the element else if not found in the array then return -1
    private static int searchEle(int[] arr, int target){
        int n = arr.length;
        if(n == 0) return -1;
        int low = 0, high = n - 1;
        int first = arr[0];

        while(low <= high) {
            int mid = low + (high - low)/2;
            int mEle = arr[mid];
            if(mEle == target) return mid;

            boolean ifBigPart = mEle >= first; 
            boolean tBig = target >= first; 
            
            if(ifBigPart == tBig){
                if(mEle <= target){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else{
                if(ifBigPart){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
