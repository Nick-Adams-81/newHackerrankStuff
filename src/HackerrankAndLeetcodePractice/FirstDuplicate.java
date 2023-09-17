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
}
