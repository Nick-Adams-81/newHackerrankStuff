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

    public static void primes2(int num) {
        boolean flag = false;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is NOT a prime number");
        }
    }
}
