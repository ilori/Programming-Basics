import java.util.Scanner;

/**
 * Created by magix on 01-Mar-17.
 */
public class p04_EncryptedMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int[] firstArray = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            firstArray[i] = input.charAt(i) % 10;
        }
        int[] secondArray = new int[firstArray.length];
        StringBuilder newNumber = new StringBuilder();
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                secondArray[i] = firstArray[i] * firstArray[i];
            } else {
                int prevNumber = 0;
                int nextNumber = 0;
                if (firstArray.length != 1) {
                    if (i > 0) {
                        prevNumber = firstArray[i - 1];
                    }
                    if (i < firstArray.length - 1) {
                        nextNumber = firstArray[i + 1];
                    }
                }
                secondArray[i] = firstArray[i] + prevNumber + nextNumber;
            }

            newNumber.append(Integer.toString(secondArray[i]));
        }
        String whichWay = console.nextLine();
        int lenght = newNumber.length();
        int[][] matrix = new int[lenght][lenght];
        switch (whichWay) {
            case "\\": {
                for (int i = 0; i < lenght; i++) {
                    matrix[i][i] = newNumber.charAt(i) - '0';
                }
                break;
            }
            case "/": {
                for (int i = 0; i < lenght; i++) {
                    matrix[lenght - i - 1][i] = newNumber.charAt(i) - '0';
                }
                break;
            }
        }
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
