import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // first car
        System.out.print("\n" + "[Create Car 0] ");
        LicensePlate rezisPlate = new LicensePlate("GE", "REZI", 777);
        Car rezisCar = new Car("Mercedes", rezisPlate);

        System.out.println(rezisCar.toString());

        // second car
        System.out.print("[Create Car 1] ");
        LicensePlate rezisPlate2 = new LicensePlate("GE", "REZI", 555);
        Car rezisCar2 = new Car("Audi", rezisPlate2);

        System.out.println(rezisCar2.toString() + "\n");

        // parking
        System.out.print("[Create parking with 10 slots] ");

        CarPark parking = new CarPark(10);
        System.out.println(parking.toString() + "\n");

        // test .park()
        System.out.print("[Park both cars in that parking] ");
        parking.park(rezisCar);
        parking.park(rezisCar2);

        System.out.println(parking.toString());

        // test .search()
        System.out.print("[Search second car] Found on index ");
        System.out.println(parking.search(rezisPlate2) + "\n");

        // test .driveOff()
        System.out.print("[Drive off second car] ");
        parking.driveOff(rezisPlate2);
        System.out.println(parking.toString());
    }
}


