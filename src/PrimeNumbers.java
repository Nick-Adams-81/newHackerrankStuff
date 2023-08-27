import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static List<Integer> primeNumbers(int limit) {
        List<Integer> primes = new ArrayList<>();
        for(int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}
