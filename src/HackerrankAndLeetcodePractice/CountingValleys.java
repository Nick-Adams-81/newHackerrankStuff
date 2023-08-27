package HackerrankAndLeetcodePractice;

public class CountingValleys {

    public static int countingValleys(String str) {
        str = str.toLowerCase();
        int elevation = 0;
        int valleys = 0;
        for(char c : str.toCharArray()) {
            if(c == 'u') {
                if(elevation == -1) {
                    valleys++;
                }
                elevation++;
            }
            if(c == 'd') {
                elevation--;
            }
        }
        return valleys;
    }

}
