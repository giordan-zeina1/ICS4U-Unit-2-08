/*
 *
 * @author  Giordan Zeina
 * @version 1.2
 * @since   2025-11-17
 */

/**
 * Holds properties of a Bike.
 */
public class Bike extends Vehicle {

    /**
     * Number of tires on a bike.
    */
    private static final int BIKE_TIRES = 2;

    /**
     * The initial starting gear.
    */
    private static final int INITIAL_GEAR = 1;

    /**
     * The bike cadence. 
    */
    private double cadence;

    /**
     * The current gear.
    */
    private int gear;

    /**
     * Constructs a Bike.
     *
     * @param colour the bike colour
     * @param maxSpeed the max speed
     */
    public Bike(final String colour,
                final double maxSpeed) {
        super(colour, maxSpeed, BIKE_TIRES);
        this.cadence = 0.0;
        this.gear = INITIAL_GEAR;
    }

    /**
     * acceleration for a bike.
     *
     * @param appliedPower the applied power
     * @param newGear the new gear
     */
    public void accelerate(final double appliedPower,
                           final double newGear) {
        cadence += appliedPower;
        gear = (int) newGear;
        speed += cadence * gear;

        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    /**
     * Rings the bikes bell.
     *
     * @return "Ding ding!"
     */
    public String ringBell() {
        return "Ding ding!\n";
    }
}
