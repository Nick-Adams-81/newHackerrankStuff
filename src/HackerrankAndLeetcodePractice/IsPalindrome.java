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

    public static boolean isPalindrome2(String str) {
        int a_pointer = 0;
        int b_pointer = str.length() -1;
        while(a_pointer <= b_pointer) {
            if(str.charAt(a_pointer) != str.charAt(b_pointer)) {
                return helper(str, a_pointer + 1, b_pointer) || helper(str, a_pointer, b_pointer -1);
            }
            a_pointer++;
            b_pointer--;
        }
        return true;
    }

    private static boolean helper(String str, int i, int j) {
        int a_pointer = i;
        int b_pointer = j;
        while(a_pointer <= b_pointer) {
            if(str.charAt(a_pointer) != str.charAt(b_pointer)) {
                return false;
            }
            a_pointer++;
            b_pointer--;
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

    public static String breakPalindrome(String palindroime) {
        char[] chars = palindroime.toCharArray();
        int n = chars.length;

        for(int i = 0; i < n / 2; i++) {
            if(chars[i] != 'a') {
                chars[i] = 'a';
                return String.valueOf(chars);
            }
        }
        return "Not possible";
    }
}
