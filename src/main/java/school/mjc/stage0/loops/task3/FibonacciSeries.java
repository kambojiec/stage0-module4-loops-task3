package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prev1 = 0, prev2 = 1;
        System.out.println(prev1);
        System.out.println(prev2);
        for (int i = 2; i < lastFibonacci; i++) {
            int fib = prev1 + prev2;
            System.out.println(fib);
            prev1 = prev2;
            prev2 = fib;
        }
    }
}
