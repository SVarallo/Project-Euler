/**
 * Created by svarallo on 11/05/2017.
 */
public class Problem7 {
    public static void main(String[] args) {
        boolean numberFound = false;
        int i = 2;
        int j = 1;
        while (!numberFound) {
            i += 1;
            if (UtilsPE.determinePrime(i)) {
                j += 1;
            }
            if (j == 10001) {
                System.out.println(i);
                numberFound = true;
            }

        }
    }
}
