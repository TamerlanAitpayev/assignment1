public class Bus extends Vehicle {
    private int passengerCapacity;
    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return getBasePrice() * 0.12;
    }

    @Override
    public void performService() {
        System.out.println("Bus Service: Checking brakes for " + passengerCapacity + " passengers.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 20000;
    }
}