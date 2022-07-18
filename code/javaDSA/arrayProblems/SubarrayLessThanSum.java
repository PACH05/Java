package javaDSA.arrayProblems;

// You are provided with an array containing n non-negative numbers, as well as a non-negative number sum. You must determine the number of subarrays in a whose sum is less than the sum. We can make the assumption that there is no overflow. Sample input and output for the given problem is as follows:

// Input: a = [2, 5, 6]
//          sum = 10
// Output: 4

public class SubarrayLessThanSum {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6};
        int sum = 10;

        int ans = subArrays(arr,sum);
        System.out.println(ans);
    }

    private static int subArrays(int[] arr, int sum) {
        int answer = 0;
        int right = 0, left = 0, s = 0;

        while(right<arr.length){
            s = s + arr[right];
            if(s >= sum){
                s = s - arr[left];
                left++;
            }
            answer = answer + (right - left + 1);
            right++;
        }
        return answer;
    }
}

