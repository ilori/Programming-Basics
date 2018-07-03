/**
 * Created by magix on 26-Feb-17.
 */
public class RectangleOf10x10Stars {
    public static void main(String[] args) {
        int times = 10;
        String model = "*";
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < times; j++) {
                System.out.print(model);
            }
            System.out.println();
        }
    }
}
