import java.util.LinkedHashMap;
import java.util.Scanner;

public class p18_Phonebook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        LinkedHashMap<String, String> info = new LinkedHashMap<>();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s");
            String command = tokens[0].trim();

            if (command.equals("A")) {
                String name = tokens[1].trim();
                String number = tokens[2].trim();
                if (!info.containsKey(name)) {
                    info.put(name, number);
                } else {
                    info.replace(name, number);
                }
            } else if (command.equals("S")) {
                String name = tokens[1].trim();
                if (!info.containsKey(name)) {
                    System.out.printf("Contact %s does not exist.%n", name);
                } else {
                    String a = info.get(name);
                    System.out.printf("%s -> %s%n", name, a);
                }
            }
            input = console.nextLine();
        }

    }
}
