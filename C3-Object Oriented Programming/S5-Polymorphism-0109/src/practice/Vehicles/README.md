# Practice 2: Vehicle

John is new to Java and is working on polymorphism. He wants to create a `Bike` class and a `Car` class. In the future, he may want to create a few more vehicles, so he wants some features to be overridden from the abstract class `VehicleManufacturer` and from the interface Vehicle.\
Help John achieve this task.

## Tasks

- Create an abstract class `VehicleManufacturer` inside the package `com.vehicles`
- Declare private instance variable `vehicleName`, `vehicleModelName` and `vehicleType` with appropriate datatype.
- Create default and Parameterized constructor.
- Declare getters and setters for the instance variable.

## Tasks II

- Define abstract method `getManufacturerInformation()` having String as a return type.
- Declare `Vehicle` as an interface inside the package defined, with an abstract method

    ```java
    int maxSpeed (String vehicleType);
    ```

- Create `Bike` class inside the package defined, that will extend `VehicleManufacturer` and implement `Vehicle` interface and will override all the abstract methods.
- Create parameterized constructor to initialize all the super class variables.
- Inside the `Bike` class `maxSpeed()` method should return maximum speed depending upon their types:
  - If `vehicleType` is equal to `sportsBike` then return speed as 300kmh
  - If `vehicleType` is equal to `cruiser`, then return speed as 170kmh
- Inside the `Bike` class `getManufacturerInformation()` method should return output in the
format : `Bike {Manufacturer name: ' name ' , Model Name: 'modelName' , Type: 'type '}`

## Tasks III

- Create a `Car` class that will extend `VehicleManufacturer`, implement the `Vehicle` interface, and override all the abstract methods.
- Create a parameterized constructor to initialize all the super class variables.
- Inside the `Car` class, the `maxSpeed()` method should return the maximum speed depending on the type:
  - If `vehicleType` is equal to `SportsCar`, then the return speed is 250 km/h.
  - If `vehicleType` is equal to `Sedan`, then the return speed is 170 km/h.
- Inside the `Car` class, the `getManufacturerInformation()` method should return output in the following format: `Car {Manufacturer name: ' name ' , Model Name: 'modelName ' , Type: 'type'}`

## Tasks IV

- Create the vehicleservice class inside the package com.vehicle.
- Declare the main method and inside the main method:
  - Create object of Bike class by calling parameterized constructor and passing all the
parameters value.
  - Call the maxSpeed() mathod and print the int value returned by the method.
  - Call the getManufacturer1nformation() method and print the String value returned by the
method.
- Sample Output for Car Object:

    ```text
    Car type is Sedan its speed is 190
    Car{Manufacturer Name:Santr0123, Type: sedan}
    ```
