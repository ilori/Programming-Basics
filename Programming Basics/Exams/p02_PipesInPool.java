import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p02_PipesInPool {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int volume = Integer.parseInt(console.nextLine());
        int pipe1 = Integer.parseInt(console.nextLine());
        int pipe2 = Integer.parseInt(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());
        double totalVolume = pipe1 * hours + pipe2 * hours;
        DecimalFormat df = new DecimalFormat("#.##");
        if (volume >= totalVolume) {
            System.out.printf("The pool is %.0f%s full. Pipe 1: %.0f%s. Pipe 2: %.0f%s.", Math.floor(totalVolume / volume * 100), "%", Math.floor(pipe1 * hours / totalVolume * 100), "%", Math.floor(pipe2 * hours / totalVolume * 100), "%");
        }else if(hours==(int)hours){
            System.out.printf("For %.0f hours the pool overflows with %.0f liters.", hours,totalVolume - volume);
        }
        else {
            System.out.printf("For %s hours the pool overflows with %s liters.",df.format(hours), df.format(totalVolume-volume));
        }
    }
}
