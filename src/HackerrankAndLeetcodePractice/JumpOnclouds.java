package HackerrankAndLeetcodePractice;

public class JumpOnclouds {

    public static int jumpOnClouds(int[] clouds) {
        int jumps = 0;
        int i = 0;
        while(i < clouds.length -1) {
            if(i + 2 == clouds.length || clouds[i + 2] == 1){
                i++;
                jumps++;
            } else {
                i += 2;
                jumps++;
            }
        }
        return jumps;
    }
}
