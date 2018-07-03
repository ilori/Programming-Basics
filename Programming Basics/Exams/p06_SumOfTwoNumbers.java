import java.util.Scanner;

/**
 * Created by magix on 4/12/2017.
 */
public class p06_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int startNum = Integer.parseInt(console.nextLine());
        int finishNum = Integer.parseInt(console.nextLine());
        int magicNum = Integer.parseInt(console.nextLine());
        int combination = 0;
        int times = 0;
        for (int i = startNum; i <= finishNum; i++) {
            for (int j = startNum; j <= finishNum; j++) {
                combination++;
                if(times > 0)
                {
                    break;
                }
                else if(i+j == magicNum)
                {
                    System.out.printf("Combination N:%d (%d + %d = %d)",combination,i,j,magicNum);
                    times++;
                }
            }
        }
        if(times<1)
        {
            System.out.printf("%d combinations - neither equals %d",combination,magicNum);
        }
    }
}
