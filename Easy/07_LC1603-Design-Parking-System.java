/*
Problem Number: 1603
Problem Name: Design Parking System
Difficulty: Easy
Topic: Classes, Objects and Constructors

APPROACH:
We create a ParkingSystem class.
We use an array to store parking spaces.
1 represents Big car.
2 represents Medium car.
3 represents Small car.

The addCar method checks whether
a parking space is available.
If available, it reduces the space by one
and returns true.
Otherwise, it returns false.
*/

class ParkingSystem {

    int[] parkingSlots;

    public ParkingSystem(int big, int medium, int small) {
        parkingSlots = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {

        if (parkingSlots[carType] > 0) {
            parkingSlots[carType]--;
            return true;
        }

        return false;
    }
}

/*
TEST CASE 1:

Input:
ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

parkingSystem.addCar(1) -> true
parkingSystem.addCar(2) -> true
parkingSystem.addCar(3) -> false
parkingSystem.addCar(1) -> false

TEST CASE 2:

Input:
ParkingSystem parkingSystem = new ParkingSystem(2, 1, 1);

parkingSystem.addCar(1) -> true
parkingSystem.addCar(1) -> true
parkingSystem.addCar(2) -> true
parkingSystem.addCar(3) -> true

DRY RUN:

Initial parking spaces:
Big = 1, Medium = 1, Small = 0

addCar(1) -> true
Big spaces = 0

addCar(2) -> true
Medium spaces = 0

addCar(3) -> false
No small parking space available.

TIME COMPLEXITY: O(1)
SPACE COMPLEXITY: O(1)
*/
