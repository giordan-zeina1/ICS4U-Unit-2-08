/*
 *
 * @author  Giordan Zeina
 * @version 1.2
 * @since   2025-11-17
 */

#ifndef BIKE_H
#define BIKE_H

#include "Vehicle.h"

class Bike : public Vehicle {
private:
    double cadence;
    double gear;

public:
    Bike(const std::string& colour, double maxSpeed, double gear)
        : Vehicle(colour, maxSpeed), cadence(0), gear(gear) {}

    void accelerate(double appliedPower, double newGear) override {
        cadence += appliedPower;
        gear = newGear;
        double newSpeed = getSpeed() + cadence * gear;
        setSpeed(newSpeed);
    }

    std::string ringBell() const {
        return "Ding ding!\n";
    }

    std::string status() const override {
        return Vehicle::status() +
               "\n-> Cadence: " + std::to_string((int)cadence);
    }
};

#endif
