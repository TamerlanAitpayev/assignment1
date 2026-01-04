public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        return getBasePrice() * 0.05 + (numberOfDoors * 50);
    }

    @Override
    public void performService() {
        System.out.println("Car Service: Checking oil and " + numberOfDoors + " doors.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }
}