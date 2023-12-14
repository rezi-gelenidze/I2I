public class TransportationExercise {
    static class Vehicle {
        int speed() {
            return 40;
        }

        int wheels = 4;

        static void move(Vehicle vehicle) {
            System.out.print(vehicle.speed() + "-");
            vehicle.travel(vehicle);
        }

        static void move(Car car) {
            System.out.print(car.horsepower + "-");
            car.travel(car);
        }

        void travel(Vehicle vehicle) {
            System.out.println(vehicle.wheels);
        }

        void travel(Car car) {
            System.out.print(car.horsepower + "-");
            this.move(this);
        }
    }

    static class Car extends Vehicle {
        int speed() {
            return 60;
        }

        int horsepower = 150;

        static void move(Vehicle vehicle) {
            System.out.print(vehicle.wheels + "-");
            (new Vehicle()).travel(vehicle);
        }

        static void move(Car car) {
            System.out.print(car.horsepower + "-");
            ((Car) car).move((Vehicle) car);
        }

        void travel(Vehicle vehicle) {
            System.out.print(vehicle.wheels + "-");
            vehicle.move((Car) vehicle);
        }

        void travel(Car car) {
            System.out.print(car.speed() + "-");
            car.move(car);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Car car = new Car();

        car.move(car); // call 1  150-4-4
        vehicle1.travel(car); // call 2  150-40-4
        vehicle2.move(car); // call 3  150-60-150-4-4
        vehicle2.travel(vehicle1); // call 4   4- ClassCastException
        vehicle2.move(vehicle2); // call 5   60-4-150-60-150-4-4
    }
}
