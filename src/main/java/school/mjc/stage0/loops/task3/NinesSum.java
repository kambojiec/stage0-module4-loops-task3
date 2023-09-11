package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long term = 9;
        for (int n = 1; n <= lengthOfLastNumber; n++) {
            sum += term;
            term = term * 10 + 9;
        }
        System.out.println(sum);
    }
}
