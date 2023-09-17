package HackerrankAndLeetcodePractice;

import java.util.HashSet;

public class FirstDuplicate {

    public static int firstDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(seen.contains(arr[i])) {
                return arr[i];
            } else {
                seen.add(arr[i]);
            }
        }
        return -1;
    }

    public static int firstDuplicte2(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[Math.abs(arr[i]) - 1] < 0) {
                return Math.abs(arr[i]);
            } else {
                arr[Math.abs(arr[i]) -1] = -arr[Math.abs(arr[i]) -1];
            }
        }
        return -1;
    }
}
