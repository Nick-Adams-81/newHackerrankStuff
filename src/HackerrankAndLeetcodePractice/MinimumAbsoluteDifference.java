package HackerrankAndLeetcodePractice;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

    public static int minDifference(int[] arr) {
        int min_val = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length -1; i++) {
            int current_diff = Math.abs(arr[i] - arr[i + 1]);
            min_val = Math.min(min_val, current_diff);
        }
        return min_val;
    }
}
