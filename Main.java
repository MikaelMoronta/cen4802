/**
 * This class contains methods related to the Fibonacci sequence.
 */
public class Main {
    /**
     * Calculates the nth term of the Fibonacci sequence recursively.
     *
     * @param n the position of the term to calculate
     * @return the nth term of the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Main method to demonstrate the usage of the fibonacci method.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
    }