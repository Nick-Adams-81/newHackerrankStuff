public class CountVowels {

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for(char ch : str.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        return count;
    }
}
