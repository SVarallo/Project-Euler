package Problem1;

/**
 * Created by svarallo on 25/04/2017.
 */
public class Problem1 {

    public static void main(java.lang.String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
