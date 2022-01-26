package javaDSA;

public class Recursion1 {
    public static void main(String[] args) {
        int arr[]={1,8,9,10,78,60};
        int ans=issorted(arr, 0);
        if(ans==1){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
 //Check if the array is sorted
    public static int issorted(int arr[], int i){
            int a=0;
            int n = arr.length;
            if(i==n-2){
                return 1;
            }
            if(arr[i]<arr[i+1]){
                i++;
                a=issorted(arr,i);
            }
        return a;
    }
}
