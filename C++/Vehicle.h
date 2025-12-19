/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

#ifndef VEHICLE_H
#define VEHICLE_H

#include <string>

/**
 * Represents a generic vehicle with basic speed and color properties.
 */
class Vehicle {
private:
    std::string colour;
    double speed;
    double maxSpeed;

public:
    /**
     * Creates a Vehicle model.
     *
     * @param colour The colour of the vehicle
     * @param maxSpeed The maximum speed of the vehicle
     */
    Vehicle(const std::string& colour, double maxSpeed)
        : colour(colour), speed(0), maxSpeed(maxSpeed) {}

    /**
     * Accelerates the vehicle.
     *
     * @param accelerationPower The force used to accelerate
     * @param accelerationTime How long to accelerate for
     */
    virtual void accelerate(double accelerationPower, double accelerationTime) {
        setSpeed(speed + accelerationPower * accelerationTime);
    }

    /**
     * Brakes the vehicle.
     *
     * @param brakePower The force used to brake
     * @param brakeTime How long to brake for
     */
    void brake(double brakePower, double brakeTime) {
        setSpeed(speed - brakePower * brakeTime);
    }

    /**
     * Returns status of a vehicle.
     *
     * @return Status string
     */
    virtual std::string status() const {
        return "-> Speed: " + std::to_string((int)speed) +
               "\n-> MaxSpeed: " + std::to_string((int)maxSpeed) +
               "\n-> Color: " + colour;
    }

    /**
     * Get speed and colour.
    */
    double getSpeed() const { return speed; }
    double getMaxSpeed() const { return maxSpeed; }
    std::string getColour() const { return colour; }

    /**
     * Set speed.
    */
    void setSpeed(double newSpeed) {
        if (newSpeed > maxSpeed) speed = maxSpeed;
        else if (newSpeed < 0) speed = 0;
        else speed = newSpeed;
    }

    /**
     * Set colour.
    */
    void setColour(const std::string& newColour) { colour = newColour; }
};

#endif // VEHICLE_H
