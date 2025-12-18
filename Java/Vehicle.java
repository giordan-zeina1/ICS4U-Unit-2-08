/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

public class Vehicle {

    String colour;
    double speed;
    double maxSpeed;

    public Vehicle(String colour, double maxSpeed) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    public void accelerate(double accelerationPower, double accelerationTime) {
        speed += accelerationPower * accelerationTime;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    public void brake(double brakePower, double brakeTime) {
        speed -= brakePower * brakeTime;
        if (speed < 0) {
            speed = 0;
        }
    }

    public String status() {
        return "-> Speed: " + (int) speed +
               "\n-> MaxSpeed: " + (int) maxSpeed +
               "\n-> Color: " + colour;
    }
}
