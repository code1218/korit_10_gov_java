package study.ch10.ex;

import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];

        // 3 x 3 의 행렬을 1 ~ 9까지 채워라
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = j + 1;
                nums[i][j] = num + (i * nums[i].length);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
