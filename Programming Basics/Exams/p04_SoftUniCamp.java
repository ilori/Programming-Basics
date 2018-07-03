import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p04_SoftUniCamp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double numberOfGroups = Integer.parseInt(console.nextLine());
        double peopleCar = 0;
        double peopleMicroBus = 0;
        double peopleSmallBus = 0;
        double peopleBigBus = 0;
        double peopleTrain = 0;
        for (int i = 0; i < numberOfGroups; i++) {
            int group = Integer.parseInt(console.nextLine());
            if (group > 0 && group <= 5) {
                peopleCar += group;
            } else if (group >= 6 && group <= 12) {
                peopleMicroBus += group;
            } else if (group >= 13 && group <= 25) {
                peopleSmallBus += group;
            } else if (group >= 26 && group <= 40) {
                peopleBigBus += group;
            } else {
                peopleTrain += group;
            }
        }
        double totalPeople = peopleBigBus + peopleCar + peopleSmallBus + peopleMicroBus + peopleTrain;
        peopleCar = peopleCar / totalPeople * 100;
        peopleMicroBus = peopleMicroBus / totalPeople * 100;
        peopleSmallBus = peopleSmallBus / totalPeople * 100;
        peopleBigBus = peopleBigBus / totalPeople * 100;
        peopleTrain = peopleTrain / totalPeople * 100;
        System.out.printf("%.2f%s%n%.2f%s%n%.2f%s%n%.2f%s%n%.2f%s", peopleCar, "%", peopleMicroBus, "%", peopleSmallBus, "%", peopleBigBus, "%", peopleTrain, "%");
    }
}
