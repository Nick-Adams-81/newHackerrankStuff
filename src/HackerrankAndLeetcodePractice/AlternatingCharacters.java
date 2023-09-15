package HackerrankAndLeetcodePractice;

public class AlternatingCharacters {

    public static int alternatingChars(String str) {
        int deletions = 0;
        for(int i = 0; i < str.length() -1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                deletions++;
            }
        }
        return deletions;
    }
}
