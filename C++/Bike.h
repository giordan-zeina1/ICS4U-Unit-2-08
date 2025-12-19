/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

#ifndef BIKE_H
#define BIKE_H

#include "Vehicle.h"
#include <string>

/**
 * Represents a Bike.
 */
class Bike : public Vehicle {
private:
    double cadence;
    double gear;

public:
    /**
     * Creates a Bike model.
     *
     * @param colour The colour of the bike
     * @param maxSpeed The maximum speed of the bike
     * @param gear The initial gear of the bike
     */
    Bike(const std::string& colour, double maxSpeed, double gear)
        : Vehicle(colour, maxSpeed), cadence(0), gear(gear) {}

    /**
     * Accelerates the bike.
     *
     * @param appliedPower The power applied to accelerate
     * @param newGear The new gear to use
     */
    void accelerate(double appliedPower, double newGear) override {
        cadence += appliedPower;
        gear = newGear;
        double newSpeed = getSpeed() + cadence * gear;
        setSpeed(newSpeed);
    }

    /**
     * Rings the bike bell.
     *
     * @return Bell sound
     */
    std::string ringBell() const {
        return "Ding ding!\n";
    }

    /**
     * Returns status of the bike.
     *
     * @return Status string
     */
    std::string status() const override {
        return Vehicle::status() +
               "\n-> Cadence: " + std::to_string((int)cadence);
    }
};

#endif // BIKE_H
