public class Main {

    public static void main(String[] args) {
        RemoveVowels remove = new RemoveVowels();
        System.out.println(ReverseString.reverseString("a man, a plan; A canal, panama!"));
        System.out.println(ReverseString.reverseStr("world"));
        System.out.println(CountVowels.countVowels("hello world"));
        System.out.println(remove.removeVowels("hello world"));
        System.out.println(remove.remove("hello world"));

        FizzBuzz.fizzBuzz(50);


        System.out.println("Fibonacci sequence:");
        for(int i = 2; i < 20; i++) {
            System.out.println(FibonacciSequence.fibonacci(i));
        }

        System.out.println(PrimeNumbers.primeNumbers(50));

        for(int i = 0; i <= 50; i++) {
            PrimeNumbers.primes2(i);
        }
    }
}
