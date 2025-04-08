public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        int number = LOWERBOUND;
        final int UPPERBOUND = 100;

        while(number <= UPPERBOUND) {
            sum += number;
            ++number;
        }

        System.out.println("The sum is: " + sum);
    }
}
