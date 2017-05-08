/**
 * Created by svarallo on 08/05/2017.
 */
public class Problem3 {
    public static void main(String[] args) {
        long startNum = 600851475143L;
        double sqNum = Math.sqrt(600851475143L);
        for (int i = 1; i < sqNum; i++) {
            if (UtilsPE.determinePrime(i)) {
                if (startNum % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
