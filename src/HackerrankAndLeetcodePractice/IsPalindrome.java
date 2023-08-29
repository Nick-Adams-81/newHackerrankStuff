package HackerrankAndLeetcodePractice;

import java.util.Locale;

public class IsPalindrome {

    public static boolean isPalindrome(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }

    public static boolean palindrome(String str) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)) {
                result.append(c);
            }
        }
        result = new StringBuilder(result.toString().toLowerCase());
        int aPointer = 0;
        int bPointer = result.length() -1;
        while(aPointer <= bPointer) {
            if(result.charAt(aPointer) != result.charAt(bPointer)) {
                return false;
            }

            aPointer++;
            bPointer--;
        }
        return true;
    }

    public static boolean palindromeNumber(int x) {
        if(x == 0) return true;
        if(x < 0 || x % 10 == 0) return false;
        int reversed = 0;
        while(x > reversed) {
            int pop = x % 10;
            x /= 10;
            reversed = (reversed * 10) + pop;
        }

        return x == reversed || x == reversed / 10;
    }
}
