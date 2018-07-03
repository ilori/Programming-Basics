import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class NumberFrom0to100ToText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int digit1, digit2;
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        int userNumber = console.nextInt();
        if (userNumber >= 0 && userNumber < 101) {
            if (userNumber >= 0 && userNumber <= 19) {
                System.out.println(nums[userNumber]);
            }
            if (userNumber >= 20 && userNumber <= 99 && userNumber%10 != 0) {
                digit1 = userNumber / 10;
                digit2 = userNumber % 10;
                System.out.println(tens[digit1] + " " + nums[digit2]);
            }
            if (userNumber > 19 && userNumber < 100 && userNumber%10 == 0)
            {
                digit1 = userNumber/10;
                System.out.println(tens[digit1]);
            }
            if (userNumber == 100) {
                System.out.println("one hundred");
            }
        }else {
            System.out.println("invalid number");
        }
    }
}
