package HackerrankAndLeetcodePractice;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

    public static int sockMerchant(int[] socks) {
        if(socks.length == 0) return 0;
        int pairs = 0;
        Set<Integer> sockPile = new HashSet<>();
        for(int i = 0; i < socks.length; i++) {
            if(!sockPile.contains(socks[i])) {
                sockPile.add(socks[i]);
            } else {
                pairs++;
                sockPile.remove(socks[i]);
            }
        }
        return pairs;
    }
}
