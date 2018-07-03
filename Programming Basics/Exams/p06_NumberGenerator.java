import java.util.Scanner;

/**
 * Created by magix on 5/11/2017.
 */
public class p06_NumberGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = Integer.parseInt(console.nextLine());
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        int specialNum = Integer.parseInt(console.nextLine());
        int controlNum = Integer.parseInt(console.nextLine());
        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = l; k >= 1; k--) {
                    String iToText = Integer.toString(i);
                    String jToText = Integer.toString(j);
                    String kToText = Integer.toString(k);
                    String number = iToText + jToText + kToText;
                    int finalNum = Integer.parseInt(number);
                    if(specialNum >= controlNum)
                    {
                        break;
                    }
                    else if (finalNum % 3 == 0) {
                        specialNum += 5;
                        continue;
                    } else if (finalNum % 10 == 5) {
                        specialNum -= 2;
                        continue;
                    } else if (finalNum % 2 == 0) {
                        specialNum*=2;
                        continue;
                    }
                }
            }
        }
        if(specialNum>=controlNum)
        {
            System.out.printf("Yes! Control number was reached! Current special number is %d.",specialNum);
        }else {
            System.out.printf("No! %d is the last reached special number.",specialNum);
        }
    }
}
