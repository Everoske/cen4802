public class FibonacciDemo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + GetFibonacciTerm(n));
    }

    private static int GetFibonacciTerm(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;

        return GetFibonacciTerm(n - 1) + GetFibonacciTerm(n - 2);
    }
}
