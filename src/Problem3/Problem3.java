package Problem3;

/**
 * Created by svarallo on 08/05/2017.
 */
public class Problem3 {
    public static void main(String[] args) {
        long startNum = 600851475143L;
        double sqNum = Math.sqrt(600851475143L);
        for (int i = 1; i < sqNum; i++) {
            if (ifPrime(i)) {
                if (startNum % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean ifPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
