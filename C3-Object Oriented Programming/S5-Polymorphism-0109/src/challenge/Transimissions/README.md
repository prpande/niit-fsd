# Challenge: World of Vehicles

Lukxtech, a leading vehicle manufacturer, has organized a competition to help select the design of its next-generation remote vehicle-monitoring system. The company manufactures a range of passenger cars based on different engine and transmission configurations. To
win the competition, participants must create a design that caters to all the different models of cars the company makes. As one of the competitors, you need to create a proof-of-concept
prototype to demonstrate the power of your design.

In order to harness the power of an engine and transmit it to the wheels smoothly, a vehicle needs a transmission. The transmission allows the engine to operate at its optimal speed (in rpm) to ensure fuel efficiency and minimal emissions, while allowing the driver to
operate the vehicle at the desired speed (in mph). While modern transmissions can be very complex, they essentially contain a set of gears or equivalent mechanical devices that
allow the rotational speed and power of the engine to be transmitted to the wheels.

Lukxtech has developed several transmissions to suit the different types of passenger vehicles and the variety of engines that it produces. Affordable entry-level cars are typically fitted with a manual transmission, while the more expensive cars have an automatic transmission.
Automated manual transmission (AMT) is a category that carmakers have introduced that is between entry-level and luxury. Furthermore, there are multiple types of automatic transmissions that have been developed by the automobile industry-torque
converters, continuously variable transmissions (CVT), and dual-clutch transmissions (DCT). Lukxtech offers 6-speed CVTs, and 8-speed DCTs.

## Challenge Statement

The table below shows the full range of transmissions offered by Lukxtech, along with their
specifications.
| Type Of Transmission | Model # | Forward Gears | 1st Gear Ratio | 2nd Gear Ratio | 3rd Gear Ratio | 4th Gear Ratio | 5th Gear Ratio | 6th Gear Ratio | 7th Gear Ratio | 8th Gear Ratio |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|Manual|MP4<br>MP5<br>MP6<br>...<br>...|4<br>5<br>6<br>...<br>...|2.540<br>3.545<br>3.010<br>...<br>...|1.920<br>1.904<br>2.070<br>...<br>...|1.510<br>1.280<br>1.430<br>...<br>...|1.000<br>0.914<br>1.000<br>...<br>...|<br>0.757<br>0.710<br>...<br>...|<br><br>0.570<br>...<br>...|||
|<br>||||
|AMT|AMTP4<br>AMTD5<br>...|4<br>5<br>...|2.540<br>2.950<br>...|1.920<br>1.940<br>...|1.510<br>1.340<br>...|1.000<br>1.000<br>...|<br>0.630<br>...|
|||

## Tasks

- Analyze the family of transmissions and create an appropriate hierarchy of classes that can be used to model the transmissions. Name the parent class: Transmission. Determine the child classes based on the descriptions and information presented in the table on the previous slide.
- Create appropriate constructors for the classes so that various transmission types can be instantiated per the specifications in the table. Use the transmission model number as a parameter in the constructor to initialize the relevant data for that transmission type, per the specifications in the table.

## Tasks II

- Write a method named showSpecs() that can be invoked for any transmission type to display the specifications of a particular transmission object.
  The transmission specifications should be displayed as follows:

    ```text
    Transmission Type: <Type of Transmission>
    Transmission Model Number: <Transmission Model #>
    Key Specifications:
    <Specification Name 1> <Specification Value>
    <Specification Name 2> <Specification Value>
    ```

    Example, an object that is an AMT D5 model will have the specifications displayed as:

    ```text
    Transmission Type:          Automated Manual
    Transmission Model Number:  AMTD5
    Key Specifications:
    1. Forward Gears:           5
    2. 1st Gear Ratio:          2.950
    3. 2nd Gear Ratio:          1.940
    4. 3rd Gear Ratio:          1.340
    5. 4th Gear Ratio:          1.000
    6. 5th Gear Ratio:          0.630
    ```

## Tasks III

- Write the `main()` method to test the class hierarchy, by declaring different kinds of transmission
objects and showing their specifications.
