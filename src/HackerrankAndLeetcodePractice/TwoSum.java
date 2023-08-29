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

    public static int[] twoSumTwo(int[] nums, int target) {
        int aPointer = 0;
        int bPointer = nums.length -1;
        while(aPointer <= bPointer) {
            int sum = nums[aPointer] + nums[bPointer];
            if(sum > target) {
                bPointer--;
            } else if(sum < target) {
                aPointer++;
            } else {
                return new int[] {aPointer + 1, bPointer + 1};

            }
        }
        return new int[] {aPointer + 1, bPointer + 1};
    }
}
