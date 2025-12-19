/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2025-11-17
 */

#include <iostream>
#include "Bike.h"
#include "Truck.h"


int main() {

    // Constants
    const int bikeMaxSpeed = 40;
    const int bikeGear = 2;
    const int truckMaxSpeed = 200;
    const int powerTen = 10;
    const int timeTen = 10;
    const int timeTwenty = 20;
    const int airPressure = 10;
    const int powerFifteen = 15;

    std::cout << "Created Bmx bike.\n";
    Bike bike("Red", bikeMaxSpeed, bikeGear);

    std::cout << "Status:\n";
    std::cout << bike.status() << "\n";

    std::cout << "\nSet the cadence to 10\n";
    bike.accelerate(powerTen, bikeGear);
    std::cout << bike.status() << "\n";

    std::cout << "\nAccelerate by 15:\n";
    bike.accelerate(powerFifteen, bikeGear);
    std::cout << "-> Speed: " << (int)bike.getSpeed()
              << " (ACTUAL SPEED 45)\n";
    std::cout << "-> MaxSpeed: " << (int)bike.getMaxSpeed() << "\n";
    std::cout << "-> Color: Red\n";
    std::cout << "-> Cadence: 25\n";

    std::cout << "\nCreated a Truck.\n";
    Truck truck("Grey", truckMaxSpeed, "HGC-3456F");

    std::cout << "Status:\n";
    std::cout << truck.status() << "\n";

    std::cout << "\nAccelerating, 10 of power for ten seconds:\n";
    truck.accelerate(powerTen, timeTen);
    std::cout << "New speed: " << (int)truck.getSpeed() << "\n";

    std::cout << "\nBraking, 10 of power for 10 seconds:\n";
    truck.brake(powerTen, timeTen);
    std::cout << "New Speed: " << (int)truck.getSpeed() << "\n";

    std::cout << "Accelerating, 10 of power for 20 seconds:\n";
    truck.accelerate(powerTen, timeTwenty);
    std::cout << "New Speed: " << (int)truck.getSpeed() << "\n";

    std::cout << "Applied Air pressure of 10:\n";
    truck.provideAir(airPressure);
    std::cout << "New Speed " << (int)truck.getSpeed() << "\n";

    std::cout << "\nDone.\n";
    return 0;
}
