/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

#ifndef TRUCK_H
#define TRUCK_H

#include "Vehicle.h"
#include <string>

/**
 * Represents a Truck.
 */
class Truck : public Vehicle {
private:
    std::string licensePlateNumber;
    int doors = 2;

public:
    /**
     * Creates a Truck model.
     *
     * @param colour The colour of the truck
     * @param maxSpeed The maximum speed of the truck
     * @param licensePlateNumber The license plate number
     */
    Truck(const std::string& colour, double maxSpeed, const std::string& licensePlateNumber)
        : Vehicle(colour, maxSpeed), licensePlateNumber(licensePlateNumber) {}

    /**
     * Applies air pressure to reduce the truck's speed.
     *
     * @param airPressure The applied air pressure
     */
    void provideAir(double airPressure) {
        setSpeed(getSpeed() - airPressure / 2);
    }

    /**
     * Returns status of the truck.
     *
     * @return Status string
     */
    std::string status() const override {
        return Vehicle::status() +
               "\n-> License Plate: " + licensePlateNumber;
    }
};

#endif // TRUCK_H
