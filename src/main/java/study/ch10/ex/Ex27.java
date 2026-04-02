package study.ch10.ex;

import java.util.Arrays;

public class Ex27 {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        int[] rowSums = new int[nums.length];

        // 3 x 3 의 행렬을 1 ~ 9까지 채워라
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = j + 1;
                nums[i][j] = num + (i * nums[i].length);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                rowSums[i] += nums[i][j];
            }
        }

        System.out.println(Arrays.toString(rowSums));



    }
}
