/**
 * Created by magix on 26-Feb-17.
 */
public class NumbersEndingIn7 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 1000; i++) {
            num++;
            if (num % 10 == 7) {
                System.out.println(num);
            }
        }
    }
}
