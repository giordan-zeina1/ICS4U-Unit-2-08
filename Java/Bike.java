/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

public class Bike extends Vehicle {

    private double cadence;
    private double gear;

    public Bike(String colour, double maxSpeed, double gear) {
        super(colour, maxSpeed);
        this.cadence = 0;
        this.gear = gear;
    }

    // overrides Vehicle accelerate
    @Override
    public void accelerate(double appliedPower, double newGear) {
        cadence += appliedPower;
        gear = newGear;
        speed += cadence * gear;

        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    public String ringBell() {
        return "Ding ding!\n";
    }

    @Override
    public String status() {
        return super.status() +
               "\n-> Cadence: " + (int) cadence;
    }
}
