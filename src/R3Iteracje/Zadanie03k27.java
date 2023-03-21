package R3Iteracje;

import java.math.BigDecimal;
import java.math.BigInteger;

class LiczbaEulera {
    public static BigInteger silnia(int x) {
        BigInteger temp = new BigInteger("1");
        for (int i = 1; i <= x; i++) {
            temp = temp.multiply(new BigInteger("" + i));
        }
        return temp;
    }
}

public class Zadanie03k27 {
    public static void main(String[] args) {
        /*Napisz program, który oblicza wartość liczby Eulera e z bardzo
        dużą dokładnością np. do tysiąca liczb po przecinku
         */
        BigDecimal e = new BigDecimal(0.0);
        for (int i = 0; i < 1000; i++) {
            BigDecimal temp = new BigDecimal(1.0);
            BigDecimal temp2 = new BigDecimal(LiczbaEulera.silnia(i));
            temp2 = temp.divide(temp2, 1000, BigDecimal.ROUND_UP);
            e = e.add(temp2);
        }
        System.out.println(e + ".");
    }
}
