/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

public final class Main {

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static void main(String[] args) {

        // Bike
        System.out.println("Created Bmx bike.");
        Bike bike = new Bike("Red", 40, 2);

        System.out.println("Status:");
        System.out.println(bike.status());

        System.out.println("\nSet the cadence to 10");
        bike.accelerate(10, 2);
        System.out.println(bike.status());

        System.out.println("\nAccelerate by 15:");
        bike.accelerate(15, 2);
        System.out.println("-> Speed: " + (int) bike.speed + " (ACTUAL SPEED 45)");
        System.out.println("-> MaxSpeed: 40");
        System.out.println("-> Color: Red");
        System.out.println("-> Cadence: 25");

        // Truck
        System.out.println("\nCreated a Truck.");
        Truck truck = new Truck("Grey", 200, "HGC-3456F");

        System.out.println("Status:");
        System.out.println(truck.status());

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        truck.accelerate(10, 10);
        System.out.println("New speed: " + (int) truck.speed);

        System.out.println("\nBraking, 10 of power for 10 seconds:");
        truck.brake(10, 10);
        System.out.println("New Speed: " + (int) truck.speed);

        System.out.println("Accelerating, 10 of power for 20 seconds:");
        truck.accelerate(10, 20);
        System.out.println("New Speed: " + (int) truck.speed);

        System.out.println("Applied Air pressure of 10:");
        truck.provideAir(10);
        System.out.println("New Speed " + (int) truck.speed);

        System.out.println("\nDone.");
    }
}
