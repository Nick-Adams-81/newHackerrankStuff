package HackerrankAndLeetcodePractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp)) {
                return new int[] {map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
