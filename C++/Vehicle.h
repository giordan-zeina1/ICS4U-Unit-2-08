/*
 *
 * @author  Giordan Zeina
 * @version 1.2
 * @since   2025-11-17
 */

#ifndef VEHICLE_H
#define VEHICLE_H

#include <string>

class Vehicle {
private:
    std::string colour;
    double speed;
    double maxSpeed;

public:
    Vehicle(const std::string& colour, double maxSpeed)
        : colour(colour), speed(0), maxSpeed(maxSpeed) {}

    virtual void accelerate(double accelerationPower, double accelerationTime) {
        setSpeed(speed + accelerationPower * accelerationTime);
    }

    void brake(double brakePower, double brakeTime) {
        setSpeed(speed - brakePower * brakeTime);
    }

    virtual std::string status() const {
        return "-> Speed: " + std::to_string((int)speed) +
               "\n-> MaxSpeed: " + std::to_string((int)maxSpeed) +
               "\n-> Color: " + colour;
    }

    // Getters
    double getSpeed() const { return speed; }
    double getMaxSpeed() const { return maxSpeed; }
    std::string getColour() const { return colour; }

    // Setters
    void setSpeed(double newSpeed) {
        if (newSpeed > maxSpeed) speed = maxSpeed;
        else if (newSpeed < 0) speed = 0;
        else speed = newSpeed;
    }

    void setColour(const std::string& newColour) { colour = newColour; }

    virtual ~Vehicle() {}
};

#endif
