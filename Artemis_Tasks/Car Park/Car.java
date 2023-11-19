public class Car {
    private static int count = 12;
    int chassisNumber;
    String brand;
    LicensePlate licensePlate;

    public Car(String brand, LicensePlate licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;

        this.chassisNumber = count;
        count++;
    }

    public String toString() {
        return "Car " + this.chassisNumber + ": (Brand: " + this.brand + ", LicensePlate: " + this.licensePlate.toString() + ")";
    }
}

