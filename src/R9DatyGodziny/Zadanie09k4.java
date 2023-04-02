package R9DatyGodziny;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.time.Duration;
import java.time.LocalTime;

public class Zadanie09k4 {
    public static void main(String[] args) {
        /*Napisz program który mierzy czas obliczeń liczby PI z zadania 3.25)
         */
        long startFirstMethod=System.currentTimeMillis();
        LocalTime startSecondMethod = LocalTime.now();

        BigInteger n1 = new BigInteger("999999");
        double x, y;
        //int k = 0;
        BigDecimal k1 = BigDecimal.ZERO;

        for (BigInteger i1 = BigInteger.ONE; i1.compareTo(n1) < 0; i1 = i1.add(BigInteger.ONE)) {
            System.out.println(i1);
            x = Math.random();
            y = Math.random();
            if (x * x + y * y <= 1) {
                //k++;
                k1 = k1.add(BigDecimal.ONE);
            }
        }
        BigDecimal n2 = new BigDecimal(n1.subtract(BigInteger.ONE));
        //double pi = 4.0 * k / n;
        System.out.println("N2 wynosi: " + n2);
        System.out.println("K1 wynosi: " + k1);
        BigDecimal d = k1.divide(n2, MathContext.DECIMAL128);
        System.out.println("K1/n2 wynosi: " + d);
        double pi = 4.0 * d.doubleValue();
        System.out.println("Obliczona liczba pi= \t" + pi + ".");
        System.out.println("Stała pi: \t\t\t\t" + Math.PI + ".");
        System.out.println("Różnica= " + Math.abs(Math.PI - pi) + ".");

        long stopFirstMethod=System.currentTimeMillis();
        LocalTime stopSecondMethod = LocalTime.now();

        System.out.println("(First method)Calculating the number of PI took time: "+ (stopFirstMethod-startFirstMethod)+ " milisecond.");

        long tooktime= Duration.between(startSecondMethod, stopSecondMethod).toMillis();
        System.out.println("(Second method)Calculating the number of PI took time: " + tooktime + " milisecond.");
    }
}
