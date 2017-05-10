/**
 * Created by svarallo on 08/05/2017.
 */
public class Problem5 {

    public static void main(String[] args) {
        boolean numberFound = false;
        int i = 1;
        while (!numberFound) {
            i += 1;
            for (int j = 1; j <= 20; j++) {
                if (!UtilsPE.isEvenlyDivisible(i, j)) {
                    break;
                }
                if (j == 20) {
                    System.out.println(i);
                    numberFound = true;
                }
            }
        }
    }
}
