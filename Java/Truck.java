/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-12-01
 */

public class Truck extends Vehicle {

    private String licensePlateNumber;
    private int doors = 2;

    public Truck(String colour, double maxSpeed, String licensePlateNumber) {
        super(colour, maxSpeed);
        this.licensePlateNumber = licensePlateNumber;
    }

    public void provideAir(double airPressure) {
        speed -= airPressure / 2;
        if (speed < 0) {
            speed = 0;
        }
    }

    public String status() {
        return super.status() +
               "\n-> License Plate: " + licensePlateNumber;
    }
}
