/**
 * Created by svarallo on 05/05/2017.
 */
public class Problem2 {

    public static void main(String[] args) {
        int sum = 0;
        int temp1 = 1;
        int temp2 = 1;
        int currentNum = 0;
        while (currentNum < 4000000) {
            if (currentNum % 2 == 0) {
                sum += currentNum;
            }
            currentNum = temp1 + temp2;
            temp2 = temp1;
            temp1 = currentNum;

        }
        System.out.println(sum);
    }
}

