/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

/**
 * Holds properties of a vehicle.
 */
public class Vehicle {

    /**
     * Default starting speed.
    */
    private static final double DEFAULT_SPEED = 0.0;

    /**
     * The colour of the vehicle.
    */
    private String colour;

    /**
     * The current speed of the vehicle.
    */
    private double speed;

    /**
     * The maximum speed of the vehicle.
    */
    private double maxSpeed;

    /**
     * The number of tires on the vehicle.
    */
    private int numberOfTires;

    /**
     * Creates a Vehicle.
     *
     * @param colour the colour of the vehicle
     * @param maxSpeed the maximum speed
     * @param numberOfTires the number of tires
     */
    public Vehicle(final String colour,
                   final double maxSpeed,
                   final int numberOfTires) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.numberOfTires = numberOfTires;
        this.speed = DEFAULT_SPEED;
    }

    /**
     * Accelerates the vehicle.
     *
     * @param accelerationPower the power applied
     * @param accelerationTime the time that the power is applied for
     */
    public void accelerate(final double accelerationPower,
                           final double accelerationTime) {
        speed += accelerationPower * accelerationTime;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    /**
     * Brakes the vehicle.
     *
     * @param brakePower the braking power
     * @param brakeTime the time that the car is braking
     */
    public void brake(final double brakePower,
                      final double brakeTime) {
        speed -= brakePower * brakeTime;
        if (speed < DEFAULT_SPEED) {
            speed = DEFAULT_SPEED;
        }
    }

    /**
     * Gets the current speed.
     *
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Gets the number of tires.
     *
     * @return the number of tires
     */
    public int getNumberOfTires() {
        return numberOfTires;
    }
}
