package HackerrankAndLeetcodePractice;

import java.util.Arrays;


public class LuckBalance {

    public static int luckBalance(int k, int[][] contests) {
        int luckBalance = 0;
        Arrays.sort(contests, (a, b) -> -1 * Integer.compare(a[0], b[0]));

        for(int i = 0; i < contests.length; i++) {
            int luck = contests[i][0];
            int importance = contests[i][1];

            if(importance == 1 && k > 0) {
                k--;
                luckBalance++;
            } else if(importance == 1 && k == 0) {
                luckBalance -= luck;
            }
            if(importance == 0) {
                luckBalance += luck;
            }
        }

        return luckBalance;
    }
}
