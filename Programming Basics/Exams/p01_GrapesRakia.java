import java.util.Scanner;

/**
 * Created by magix on 4/15/2017.
 */
public class p01_GrapesRakia {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double area = Double.parseDouble(console.nextLine());
        double weight = Double.parseDouble(console.nextLine());
        double morgage = Double.parseDouble(console.nextLine());
        double total = area * weight - morgage;
        double rakia = (total * 0.45) / 7.5 * 9.8;
        double forSale = (total * 0.55) * 1.5;
        System.out.printf("%.2f\n%.2f", rakia, forSale);
    }
}
