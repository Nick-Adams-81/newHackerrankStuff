package HackerrankAndLeetcodePractice;


import java.util.Locale;

public class IsAnagram {

    public static boolean isAnagram(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        a = a.toLowerCase(Locale.ROOT);
        b = b.toLowerCase(Locale.ROOT);
        if(aLength != bLength) return false;
        int[] charFrequencies = new int[26];

        for(int i = 0; i < aLength; i++) {
            char currentChar = a.charAt(i);
            int index = currentChar - 'a';
            charFrequencies[index]++;
        }
        for(int i = 0; i < bLength; i++) {
            char currentChar = b.charAt(i);
            int index = currentChar - 'a';
            charFrequencies[index]++;
        }

        for(int i = 0; i < 26; i++) {
            if(charFrequencies[i] != 0) return false;
        }
        return true;

    }
}

