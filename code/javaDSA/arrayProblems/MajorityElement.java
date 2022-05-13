package javaDSA.arrayProblems;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 1, 1 };
        majorityElement(arr);
    }

    // Brute Force
    public static int majorityElement(int[] nums) {
        int maj_ele = nums.length / 2;
        for (int num : nums) {
            int count = 0;
            for (int ele : nums) {
                if (ele == num) {
                    count += 1;
                }
            }
            if (count > maj_ele) {
                return num;
            }
        }
        return -1;
    }
    //Booyer- Moore Majority Vote Algorithm
    public int majority(int nums[]) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
