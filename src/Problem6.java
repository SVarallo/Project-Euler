import java.util.stream.IntStream;

import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 * Created by svarallo on 10/05/2017.
 */
public class Problem6 {

    public static void main(String[] args) {
        int[] naturalNumArr;
        int naturalNumSum = 0;
        double naturalNumSumSq = 0;
        double[] squareNumArr;
        double squareNumSum = 0;
        int[] squareNumArrI;
        double diff = 0;

        naturalNumArr = new int[101];
        squareNumArr = new double[101];
        squareNumArrI = new int[101];

        for (int i = 0; i <= 100; i++) {
            naturalNumArr[i] = i;
        }
        naturalNumSum = IntStream.of(naturalNumArr).sum();
        naturalNumSumSq = Math.pow(naturalNumSum, 2);
        System.out.println("The square of the sum for the natural numbers is " + naturalNumSumSq);

        for (int j = 0; j <= 100; j++) {
            squareNumArr[j] = Math.pow(j, 2);
        }

        for (int k = 0; k < squareNumArr.length; k++) {

            squareNumArrI[k] = intValue(squareNumArr[k]);
        }

        squareNumSum = IntStream.of(squareNumArrI).sum();
        System.out.println("The sum of the squares of the numbers is " + squareNumSum);

        diff = naturalNumSumSq - squareNumSum;
        System.out.println("The difference between the sum of the squares and the square of the sum for this set of numbers is " + diff);
    }

}
