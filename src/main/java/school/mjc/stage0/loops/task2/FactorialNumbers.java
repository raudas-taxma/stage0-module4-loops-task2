package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int start = 0;
        int factorial = 1;
        while (start <= printToInclusive) {
            System.out.println(factorial);
            factorial *= (start + 1);
            start ++;
        }
    }
}
