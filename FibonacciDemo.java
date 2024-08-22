public class FibonacciDemo {
    public static void main(String[] args) {
        int term = 10;
        System.out.println("The " + term + "th term of the Fibonacci sequence is " + GetFibonacciTerm(term));
    }

    private static int GetFibonacciTerm(int term) {
        if (term < 1) return 0;
        if (term == 1) return 1;

        return GetFibonacciTerm(term - 1) + GetFibonacciTerm(term - 2);
    }
}
