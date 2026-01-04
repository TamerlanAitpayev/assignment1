import java.util.*;

public class FleetApp {
    private List<Vehicle> vehicles = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\n--- Fleet Management ---");
            System.out.print("\n 1. Print all");
            System.out.print("\n 2. Add Car");
            System.out.print("\n 3. Add Bus");
            System.out.print("\n 4. Total Fees");
            System.out.print("\n 5. Older than N");
            System.out.print("\n 6. Service All");
            System.out.print("\n 7. Quit");
            System.out.print("\nEnter=");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: printVehicles(); break;
                case 2: addCar(); break;
                case 3: addBus(); break;
                case 4: showFees(); break;
                case 5: showOlderThan(); break;
                case 6: serviceAll(); break;
                case 7: return;
            }
        }
    }

    private void printVehicles() {
        if (vehicles.isEmpty()) System.out.println("No vehicles in the fleet");
        else vehicles.forEach(v -> System.out.println(v.toString()));
    }

    private void addCar() {
        System.out.print("Enter Model, Year, Price, Doors: ");
        vehicles.add(new Car(sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt()));
    }

    private void addBus() {
        System.out.print("Enter Model, Year, Price, Capacity: ");
        vehicles.add(new Bus(sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt()));
    }

    private void showFees() {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateInsuranceFee();
        }
        System.out.println("Total yearly insurance: " + total);
    }

    private void showOlderThan() {
        System.out.print("Current year and N: ");
        int current = sc.nextInt();
        int n = sc.nextInt();
        for (Vehicle v : vehicles) {
            if (v.getAge(current) > n) System.out.println(v);
        }
    }

    private void serviceAll() {
        for (Vehicle v : vehicles) {
            v.performService();
        }
    }

    public static void main(String[] args) {
        new FleetApp().run();
    }
}