/*
 *
 * @author  Giordan Zeina
 * @version 1.4
 * @since   2025-11-17
 */

/**
 * Main driver program.
 */
public final class Main {

    /*
     * Bike constants
    */
    private static final double BIKE_MAX_SPEED = 40.0;
    private static final double CADENCE_SET = 10.0;
    private static final double BIKE_ACCELERATION = 15.0;

    /*
     * Truck constants
     */
    private static final double TRUCK_MAX_SPEED = 200.0;
    private static final double POWER = 10.0;
    private static final double TEN_SECONDS = 10.0;
    private static final double TWENTY_SECONDS = 20.0;
    private static final double AIR_PRESSURE = 10.0;

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Program entry point.
     *
     * @param args not used
     */
    public static void main(final String[] args) {

        /* 
         * Prints bike properties.
        */
        Bike bike = new Bike("Red", BIKE_MAX_SPEED);

        System.out.println("Created Bmx bike.");
        printBikeStatus(bike);

        System.out.println("\nSet the cadense to 10");
        bike.accelerate(CADENCE_SET, 1);
        printBikeStatus(bike);

        System.out.println("\nAccelerate by 15:");
        double beforeSpeed = bike.getSpeed();
        bike.accelerate(BIKE_ACCELERATION, 2);

        System.out.println("-> Speed: "
                + (int) bike.getSpeed()
                + "   (ACTUAL SPEED "
                + (int) (beforeSpeed + bike.getCadence() * 2)
                + ")");
        System.out.println("-> MaxSpeed: "
                + (int) bike.getMaxSpeed());
        System.out.println("-> Color: Red");
        System.out.println("-> Cadence: "
                + (int) bike.getCadence());

        /*
         * Prints truck properties.
        */
        Truck truck = new Truck("Grey", TRUCK_MAX_SPEED, "HGC-3456F");

        System.out.println("\n\nCreated a Truck.");
        printTruckStatus(truck);

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        truck.accelerate(POWER, TEN_SECONDS);
        System.out.println("New speed: " + (int) truck.getSpeed());

        System.out.println("\nBraking, 10 of power for 10 seconds:");
        truck.brake(POWER, TEN_SECONDS);
        System.out.println("New Speed: " + (int) truck.getSpeed());

        System.out.println("\nAccelerating, 10 of power for 20 seconds:");
        truck.accelerate(POWER, TWENTY_SECONDS);
        System.out.println("New Speed: " + (int) truck.getSpeed());

        System.out.println("\nApplied Air pressure of 10:");
        truck.provideAir(AIR_PRESSURE);
        System.out.println("New Speed " + (int) truck.getSpeed());

        System.out.println("\n\nDone.");
    }

    /**
     * Prints bike status.
     *
     * @param bike
     */
    private static void printBikeStatus(final Bike bike) {
        System.out.println("Status:");
        System.out.println("-> Speed: " + (int) bike.getSpeed());
        System.out.println("-> MaxSpeed: " + (int) bike.getMaxSpeed());
        System.out.println("-> Color: Red");
        System.out.println("-> Cadence: " + (int) bike.getCadence());
    }

    /**
     * Prints truck status.
     *
     * @param truck
     */
    private static void printTruckStatus(final Truck truck) {
        System.out.println("Status:");
        System.out.println("-> Speed: " + (int) truck.getSpeed());
        System.out.println("-> MaxSpeed: " + (int) truck.getMaxSpeed());
        System.out.println("-> Color: Grey");
        System.out.println("-> License Plate: HGC-3456F");
    }
}
