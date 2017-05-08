package Problem4;

/**
 * Created by svarallo on 08/05/2017.
 */
public class Problem4 {

    public static void main(String[] args) {
        int palCand = 10;
        int resultNum = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                palCand = i * j;
                if (palinChecker(palCand)) {
                    if (palCand > resultNum) {
                        resultNum = palCand;
                    }
                }
            }

        }
    System.out.println(resultNum);
    }

    public static boolean palinChecker(int cand) {
        String numString = Integer.toString(cand);
        String reverseNumString = new StringBuilder(numString).reverse().toString();
        if (numString.equals(reverseNumString)) {
            return true;
        }
        return false;
    }
}
