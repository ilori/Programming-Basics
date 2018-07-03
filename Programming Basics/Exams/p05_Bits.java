import java.util.Scanner;

/**
 * Created by magix on 4/3/2017.
 */
public class p05_Bits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long num = Long.parseLong(console.nextLine());
        long newNum = num;
        String command = console.nextLine();
        while (!(command.equals("Game Over!"))) {
            if (command.equals("Even")) {
                num >>= 1;
            }
            newNum = ExtractBits(newNum, num);
            num = newNum;
            command = console.nextLine();
        }
        int count = 0;
        while (newNum > 0) {
            long bit = newNum & 1;
            if(bit==1)
            {
                count++;
            }
            newNum >>= 1;
        }
        System.out.printf("%d -> %d",num,count);

    }

    private static long ExtractBits(long newNum, long num) {
        newNum = num & 1;
        num >>= 2;
        int count = 1;
        while (num != 0) {
            newNum |= (num & 1) << count;
            num >>= 2;
            count++;
        }
        return newNum;
    }
}
