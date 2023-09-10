package HackerrankAndLeetcodePractice;

public class PeakIndexInMountain {

    public static int peakIndexInMountain(int[] a) {
        int left = 0;
         int right = a.length -1;
         while(left < right) {
             int mid = left + (right - left) / 2;
             if(a[mid] < a[mid + 1]) {
                 left = mid + 1;
             } else {
                 right = mid;
             }
         }
         return right;
    }
}
