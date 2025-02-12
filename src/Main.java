import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Create custom comparator
        Comparator<Patient> comparator = (a, b) -> b.riskLevel - a.riskLevel;
        // Create queue that implements custom comparator
        PriorityQueue<Patient> queue1 = new PriorityQueue<>(comparator);
        // Create new patient objects
        Patient bill = new Patient("Bill", 10, 20);
        Patient melissa = new Patient("Melissa", 10, 30);
        Patient charles = new Patient("Charles", 5, 55);
        // offer patients to queue
        queue1.offer(bill);
        queue1.offer(melissa);
        queue1.offer(charles);
        // loop through/ print patients
        for(Patient element: queue1) {
            System.out.println(element.patientName);
        }
    }
}