package HackerrankAndLeetcodePractice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(CountingValleys.countingValleys("dududu"));
        System.out.println(ValidParentheses.validParens("[{}[]]["));

        int[] nums = {2, 7, 11, 15};
        int[] clouds = {0, 1, 0, 0, 0, 1, 0};
        System.out.println(Arrays.toString(TwoSum.twoSum(nums, 17)));
        System.out.println(JumpOnclouds.jumpOnClouds(clouds));
    }

}

