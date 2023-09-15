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
        System.out.println(SubstringComparisons.substringComparison("welcometojava", 3));
        System.out.println(IsAnagram.isAnagram("hat", "tah"));

        int[] minCost = {10, 15, 20};
        System.out.println(MinCostClimbingStairs.minCost(minCost));
        String[] alienDictonary = {"hello", "leetcode"};
        System.out.println(AlienDictonary.isAlienDictonary(alienDictonary, "hlabcdefgijklmnopqrstuvwxyz"));

        int [][] matrix = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0},
        };
        System.out.println("Unflipped: " + Arrays.deepToString(matrix));
        System.out.println("Flipped: " + Arrays.deepToString(FlipAnImage.flipAndInvert(matrix)));

        String[] myStrs = {"hello", "hell", "help", "hel"};
        System.out.println(LongestCommonPrefix.longestPrefix(myStrs));
        int[] greed = {1, 2, 3};
        int[] cookies = {1, 1};
        System.out.println(AssignCookies.findContentChildren(greed, cookies));

        String balloons = "balloonballoon";
        System.out.println(MaxBaloons.maxBalloons(balloons));
        System.out.println(IsPalindrome.isPalindrome2("abca"));
        System.out.println(JewelsAndStones.jewelsAndStones("aA", "aAAbbbb"));
        int[] mountainRange = {0, 1, 2, 1, 0};
        System.out.println(PeakIndexInMountain.peakIndexInMountain(mountainRange));
        int[] stock = {7, 1, 5, 3, 6, 4};
        System.out.println(BuyAndSellStock.maxProfit(stock));
        System.out.println(IsPalindrome.breakPalindrome("aaa"));
        int[] stocks = {1, 2, 3, 4, 5};
        System.out.println(BuyAndSellStock.maxProfit2(stocks));

        int[] houses = {1, 2, 3, 1};
        System.out.println(HouseRobber.rob(houses));
    }

}

