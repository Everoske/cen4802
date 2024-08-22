public class FibonacciDemo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + GetFibonacciTerm(n));
    }

    /**
     * Gets an int representation of the nth term in the Fibonacci Sequence by
     * recursively calling itself
     * @param n Represents the number to search for the term in the Fibonacci Sequence
     * @return  The int nth term of the Fibonacci Sequence
     */
    private static int GetFibonacciTerm(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;

        return GetFibonacciTerm(n - 1) + GetFibonacciTerm(n - 2);
    }
}
