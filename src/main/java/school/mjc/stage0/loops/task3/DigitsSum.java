package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        String numString = number + "";
        for (int i = 0; i < numString.length(); i++) {
            sum += numString.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
