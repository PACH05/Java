package javaDSA.otherAlgorithms.binarySearch;

//O(N*logN)
public class AggresiveCows {
    public static void main(String[] args) {
        int arr[] = {1,2,4,8,9};
        int cows = 3;
        int n = 5; // Length of array

        int low = 0; 
        int high = arr[n - 1] - arr[0];
        int res = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canKeepCows(arr,n,cows,mid)){
                res = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }   
        System.out.println(res);
    }

        private static boolean canKeepCows(int arr[], int n, int cows, int dis){
            int cord = arr[0], count = 1;

            for (int i = 1; i < n; i++) {
                if(arr[i] - cord >= dis){
                    count++;
                    cord = arr[i];
                }
                if(count == cows) return true;
            }
            return false;

        }
}

