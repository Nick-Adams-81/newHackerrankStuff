public class ReverseString {

    public static String reverseString(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

    public static String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
