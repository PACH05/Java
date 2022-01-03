package javaDSA;

public class BubbleSort {
    public static void main(String[] args) {
      int arr[]={1,5,8,4,9,2,3};
      
      for (int i = 0; i < arr.length-1; i++) {

          for (int j = 0; j < arr.length-1; j++) {

            if (arr[j]>arr[j+1]) {
                // int temp = arr[j];
                // arr[j]=arr[j+1];
                // arr[j+1]=temp;
                arr[j]^=arr[j+1];
                arr[j+1]^=arr[j];
                arr[j]^=arr[j+1];
              }
          }
      }
      for (int i : arr) {
          System.out.println(i);
          
      }
    }
}
