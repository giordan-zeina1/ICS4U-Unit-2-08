/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

/**
 * Holds properties of a Truck.
 */
public class Truck extends Vehicle {

    /**
     * Number of tires on a truck.
    */
    private static final int TRUCK_TIRES = 4;

    /**
     * Number of doors on a truck.
    */
    private static final int TRUCK_DOORS = 2;

    /**
     * Air pressure denominator constant.
    */
    private static final double AIR_DENOMINATOR = 2.0;

    /**
     * The truck license plate number.
    */
    private String licensePlateNumber;

    /**
     * The number of doors on the truck.
    */
    private final int doors = TRUCK_DOORS;

    /**
     * Creates a Truck.
     *
     * @param colour the truck colour
     * @param maxSpeed the max speed
     * @param licensePlateNumber the license plate
     */
    public Truck(final String colour,
                 final double maxSpeed,
                 final String licensePlateNumber) {
        super(colour, maxSpeed, TRUCK_TIRES);
        this.licensePlateNumber = licensePlateNumber;
    }

    /**
     * Reduces speed based on the air pressure.
     *
     * @param airPressure the air pressure
     */
    public void provideAir(final double airPressure) {
        speed -= airPressure / AIR_DENOMINATOR;
        if (speed < 0.0) {
            speed = 0.0;
        }
    }
}
