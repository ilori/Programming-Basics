/**
 * Created by magix on 26-Feb-17.
 */
public class TriangleOfStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}