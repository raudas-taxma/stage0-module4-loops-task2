package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int n = 2;
        while (n < printToInclusive) {
           int i = 2;
           boolean prime = true;
           while (i < n) {
               if (n % i == 0) {
                   prime = false;
                   break;
               }
               i++;
           }
           if (prime) {
               System.out.println(n);
           }
            n++;
        }
    }
}
