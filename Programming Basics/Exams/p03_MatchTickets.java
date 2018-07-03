import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p03_MatchTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String ticketType = console.nextLine().toLowerCase();
        int numberOfPeople = Integer.parseInt(console.nextLine());
        double vipTicket = 499.99;
        double normalTicket = 249.99;
        if (numberOfPeople >= 1 && numberOfPeople <= 4) {
            budget = budget - (budget * 0.75);
            if (ticketType.equals("vip")) {
                if (vipTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - vipTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - vipTicket * numberOfPeople));
                }
            } else {
                if (normalTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - normalTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - normalTicket * numberOfPeople));
                }
            }
        }
        if (numberOfPeople >= 5 && numberOfPeople <= 9) {
            budget = budget - (budget * 0.6);
            if (ticketType.equals("vip")) {
                if (vipTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - vipTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - vipTicket * numberOfPeople));
                }
            } else {
                if (normalTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - normalTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - normalTicket * numberOfPeople));
                }
            }
        }
        if (numberOfPeople >= 10 && numberOfPeople <= 24) {
            budget = budget - (budget * 0.5);
            if (ticketType.equals("vip")) {
                if (vipTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - vipTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - vipTicket * numberOfPeople));
                }
            } else {
                if (normalTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - normalTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - normalTicket * numberOfPeople));
                }
            }
        }
        if (numberOfPeople >= 25 && numberOfPeople <= 49) {
            budget = budget - (budget * 0.4);
            if (ticketType.equals("vip")) {
                if (vipTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - vipTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - vipTicket * numberOfPeople));
                }
            } else {
                if (normalTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - normalTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - normalTicket * numberOfPeople));
                }
            }
        } else if (numberOfPeople >= 50) {
            budget = budget - (budget * 0.25);
            if (ticketType.equals("vip")) {
                if (vipTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - vipTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - vipTicket * numberOfPeople));
                }
            } else {
                if (normalTicket * numberOfPeople < budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - normalTicket * numberOfPeople);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - normalTicket * numberOfPeople));
                }
            }
        }

    }
}
