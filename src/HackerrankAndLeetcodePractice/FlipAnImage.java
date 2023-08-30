package HackerrankAndLeetcodePractice;

public class FlipAnImage {

    public static int[][] flipAndInvert(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            int low = 0;
            int high = a[i].length - 1;
            while(low <= high) {
                if(a[i][low] == a[i][high]) {
                    a[i][low] = 1 - a[i][low];
                    a[i][high] = a[i][low];
                }
                low++;
                high--;
            }
        }
        return a;
    }
}
