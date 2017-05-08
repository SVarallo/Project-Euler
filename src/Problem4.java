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
                if (UtilsPE.palinChecker(palCand)) {
                    if (palCand > resultNum) {
                        resultNum = palCand;
                    }
                }
            }
        }
        System.out.println(resultNum);
    }
}
