package HackerrankAndLeetcodePractice;

public class JewelsAndStones {

    public static int jewelsAndStones(String j, String s) {
        int jewels = 0;
        for(int i = 0; i < s.length(); i++) {
            if(j.indexOf(s.charAt(i)) > -1) {
                jewels++;
            }
        }
        return jewels;
    }
}
