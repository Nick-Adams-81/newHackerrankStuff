package HackerrankAndLeetcodePractice;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardinalitySort {

    public static List<Integer> cardinalitySort(List<Integer> nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums) {
            countMap.put(num, countBinaryOnes(num));
        }

        nums.sort((a, b) -> {
            int countA = countMap.get(a);
            int countB = countMap.get(b);
            if (countA != countB) {
                return countA - countB;
            } else {
                return a - b;
            }
        });
        return nums;
    }

    private static int countBinaryOnes(int num) {
        int count = 0;
        while(num != 0) {
            if((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }
        return count;
    }
}
