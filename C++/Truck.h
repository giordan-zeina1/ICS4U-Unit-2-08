/*
 *
 * @author  Giordan Zeina
 * @version 1.2
 * @since   2025-11-17
 */

#ifndef TRUCK_H
#define TRUCK_H

#include "Vehicle.h"

class Truck : public Vehicle {
private:
    std::string licensePlateNumber;
    int doors = 2;

public:
    Truck(const std::string& colour, double maxSpeed, const std::string& licensePlateNumber)
        : Vehicle(colour, maxSpeed), licensePlateNumber(licensePlateNumber) {}

    void provideAir(double airPressure) {
        setSpeed(getSpeed() - airPressure / 2);
    }

    std::string status() const override {
        return Vehicle::status() +
               "\n-> License Plate: " + licensePlateNumber;
    }
};

#endif
