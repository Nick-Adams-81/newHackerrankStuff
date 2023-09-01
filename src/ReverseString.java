public class ReverseString {

    public static String reverseString(String str) {
        str = str.toLowerCase();
        String result = "";
        for(char c : str.toCharArray()) {
            if(Character.isLetter(c) || Character.isDigit(c)) {
                result = c + result;
            }

        }
        return result;
    }

    public static String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
