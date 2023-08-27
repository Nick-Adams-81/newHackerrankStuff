public class Main {

    public static void main(String[] args) {
        RemoveVowels remove = new RemoveVowels();
        System.out.println(ReverseString.reverseString("hello"));
        System.out.println(ReverseString.reverseStr("world"));
        System.out.println(CountVowels.countVowels("hello world"));
        System.out.println(remove.removeVowels("hello world"));

        FizzBuzz.fizzBuzz(50);


        System.out.println("Fibonacci sequence:");
        for(int i = 0; i < 20; i++) {
            System.out.println(FibonacciSequence.fibonacci(i));
        }
    }
}
