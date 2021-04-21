package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] t = {1, 4, 5, 2};
        System.out.println(recursionSum(t, 0));
    }

    public static int recursionSum(int[] nums, int n) {
        if (n > nums.length-1) return 0;
        return nums[n] + recursionSum(nums, n + 1);
    }
}
