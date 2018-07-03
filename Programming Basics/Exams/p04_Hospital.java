import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p04_Hospital {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int period = Integer.parseInt(console.nextLine());
        int treatedPatients = 0;
        int untreadedPatients = 0;
        int doctors = 7;
        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(console.nextLine());
            if (i % 3 == 0 && (untreadedPatients > treatedPatients)) {
                doctors++;
            }
            if (patients <= doctors) {
                treatedPatients += patients;
            } else if (patients > doctors) {
                untreadedPatients += Math.abs(doctors - patients);
                treatedPatients += doctors;
            }
        }
        System.out.printf("Treated patients: %d.%nUntreated patients: %d.", treatedPatients, untreadedPatients);
    }
}
