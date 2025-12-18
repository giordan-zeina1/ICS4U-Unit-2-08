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

    std::cout << "Created Bmx bike.\n";
    Bike bike("Red", 40, 2);

    std::cout << "Status:\n";
    std::cout << bike.status() << "\n";

    std::cout << "\nSet the cadence to 10\n";
    bike.accelerate(10, 2);
    std::cout << bike.status() << "\n";

    std::cout << "\nAccelerate by 15:\n";
    bike.accelerate(15, 2);
    std::cout << "-> Speed: " << (int)bike.getSpeed() << " (ACTUAL SPEED 45)\n";
    std::cout << "-> MaxSpeed: " << (int)bike.getMaxSpeed() << "\n";
    std::cout << "-> Color: Red\n";
    std::cout << "-> Cadence: 25\n";

    std::cout << "\nCreated a Truck.\n";
    Truck truck("Grey", 200, "HGC-3456F");

    std::cout << "Status:\n";
    std::cout << truck.status() << "\n";

    std::cout << "\nAccelerating, 10 of power for ten seconds:\n";
    truck.accelerate(10, 10);
    std::cout << "New speed: " << (int)truck.getSpeed() << "\n";

    std::cout << "\nBraking, 10 of power for 10 seconds:\n";
    truck.brake(10, 10);
    std::cout << "New Speed: " << (int)truck.getSpeed() << "\n";

    std::cout << "Accelerating, 10 of power for 20 seconds:\n";
    truck.accelerate(10, 20);
    std::cout << "New Speed: " << (int)truck.getSpeed() << "\n";

    std::cout << "Applied Air pressure of 10:\n";
    truck.provideAir(10);
    std::cout << "New Speed " << (int)truck.getSpeed() << "\n";

    std::cout << "\nDone.\n";
    return 0;
}
