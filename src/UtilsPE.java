/**
 * Created by svarallo on 08/05/2017.
 */
public final class UtilsPE {

    public static boolean determinePrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEvenlyDivisible(int num, int divNum) {
        if (num % divNum == 0) {
            return true;
        }
        return false;
    }

    public static boolean palinChecker(int palinCand) {
        String numString = Integer.toString(palinCand);
        String reverseNumString = new StringBuilder(numString).reverse().toString();
        if (numString.equals(reverseNumString)) {
            return true;
        }
        return false;
    }
}
