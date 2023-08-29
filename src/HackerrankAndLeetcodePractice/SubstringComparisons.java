package HackerrankAndLeetcodePractice;

public class SubstringComparisons {

    public static String substringComparison(String str, int k) {
        String smallest = "";
        String largest = "";
        String currentSubstring;

        for(int i = 1; i <= str.length() -k; i++) {
            currentSubstring = str.substring(i, i + k);
            if(currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
            if(currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }
        }
        return smallest + "\n" + largest;
    }
}
