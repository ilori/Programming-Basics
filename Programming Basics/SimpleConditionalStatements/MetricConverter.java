import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double userInput = Double.parseDouble(console.nextLine());
        String fromUnit = console.nextLine();
        fromUnit = fromUnit.toLowerCase();
        String toUnit = console.nextLine();
        toUnit = toUnit.toLowerCase();
        double meters = 0;
        double converted = 0;
        if (fromUnit.equals("mm")) {
            meters = userInput / 1000;
        }
        if (fromUnit.equals("m")) {
            meters = userInput;
        }
        if (fromUnit.equals("cm")) {
            meters = userInput / 100;
        }
        if (fromUnit.equals("mi")) {
            meters = userInput / 0.000621371192;
        }
        if (fromUnit.equals("in")) {
            meters = userInput / 39.3700787;
        }
        if (fromUnit.equals("km")) {
            meters = userInput / 0.001;
        }
        if (fromUnit.equals("ft")) {
            meters = userInput / 3.2808399;
        }
        if (fromUnit.equals("yd")) {
            meters = userInput / 1.0936133;
        }
        if (toUnit.equals("mm")) {
            converted = meters * 1000;
        }
        if (toUnit.equals("cm")) {
            converted = meters * 100;
        }
        if (toUnit.equals("mi")) {
            converted = meters * 0.000621371192;
        }
        if (toUnit.equals("in")) {
            converted = meters * 39.3700787;
        }
        if (toUnit.equals("m")) {
            converted = meters;
        }
        if (toUnit.equals("km")) {
            converted = meters * 0.001;
        }
        if (toUnit.equals("ft")) {
            converted = meters * 3.2808399;
        }
        if (toUnit.equals("yd")) {
            converted = meters * 1.0936133;
        }
        System.out.printf("%f %s", converted, toUnit);
    }
}
