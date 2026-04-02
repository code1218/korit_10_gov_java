package study.ch10.ex;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums = {34, 78, 12, 56, 91, 23};
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max = nums[i];
                continue;
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("최대값: " + max);
    }
}
