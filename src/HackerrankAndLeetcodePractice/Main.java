package HackerrankAndLeetcodePractice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(CountingValleys.countingValleys("dududu"));
        System.out.println(ValidParentheses.validParens("[{}[]]["));

        int[] nums = {2, 7, 11, 15};
        int[] clouds = {0, 1, 0, 0, 0, 1, 0};
        System.out.println(Arrays.toString(TwoSum.twoSum(nums, 9)));
        System.out.println(Arrays.toString(TwoSum.twoSumTwo(nums, 9)));
        System.out.println(JumpOnclouds.jumpOnClouds(clouds));
        int[] socks = {1, 3, 2, 1, 3, 5, 7, 2};
        System.out.println(SockMerchant.sockMerchant(socks));
        System.out.println(ArraySum.arraySum(socks));

        int[][] myArr = {
                {6, 3},
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0},
        };
        System.out.println(LuckBalance.luckBalance(10, myArr));

        String str1 = "racecar";
        String str2 = "hello";
        System.out.println(IsPalindrome.isPalindrome(str2));
        System.out.println(IsPalindrome.palindrome(str1));
        System.out.println(IsPalindrome.palindromeNumber(1232));
    }

}

