# Startup Company

## I : Employee Details

A startup company wants to manage the personal details of its Employees like name, age, DOB, and address.\
The address contains the house number, street name, city, country, and zipcode.

### Tasks

1. Model the `Employee` and `Address` class.
2. Establish the Composition relationship between the `Employee` and `Address` class.

## II : Employee Information

The Employees of the company have different designations.\
A Manager will have common attributes and specific attributes like team size and ratings by the team that need to be captured.

### Tasks

1. Model the `Employee` class as the super class
2. Model the `Manager` class as a subclass.
3. Create an implementation class where the object of the `Manager` class can be created, and values assigned.
4. Display the details of the manager.

## III : Employee Information (contd.)

The Employees have different designations based on which they will get a yearly increment.\
A Manager will have common attributes and specific attributes like team size and ratings by the team that are crucial to the yearly increment.\
A Regional Head will have common attributes of the Employee and specific attributes like region name, region performance, review ratings.

### Tasks

1. Use constructors to initialize common attributes in the super class and subclasses.
2. Model the 'calculate increment' behavior of the employee.
3. The conditions for yearly increment:
   - A manager gets a 12.5% hike if the ratings by team is > 8
   - A regional head gets a 10.5% hike if the region performance is > 8 and review ratings > 7
4. Use the super keyword in the constructor and to call the variables and methods of the super class.


