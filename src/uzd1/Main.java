package uzd1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{2, 7, 11, 15};
        int[] test2 = new int[]{3, 2, 4};
        int[] test3 = new int[]{3, 3};

        int[] res1 = twoSum(test1, 9);
        int[] res2 = twoSum(test2, 6);
        int[] res3 = twoSum(test3, 6);

        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }
}