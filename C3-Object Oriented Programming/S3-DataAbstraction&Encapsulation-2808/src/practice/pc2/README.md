# Practice 2: Furniture Mart

A company manufactures plastic furniture in different colors, such as red, blue, and green. Plastic furniture comes in three grades: grade 1, grade 2, and grade 3. The furniture manufactured is for both indoor and outdoor use.\
The types of furniture manufactured are tables, chairs, cupboards, and stools. The company is giving a 5% flat discount to customers who order grade 1 outdoor furniture.

## Tasks I

- Create a class `FurnitureItem` inside the package.
- Declare the `private` attributes `furnitureCode`, `furnitureType`, `gradeOfFurniture`, `furnitureUsage`, and `furniturePrice` with appropriate data types in the `FurnitureItem` class.
- Declare a `static` and `final` `int` variable `DISCOUNT` with value `5`.
- Define a no-argument constructor in the `FurnitureItem` class.
- Create `public` getter and setter methods for all the instance variables.
- Define a `calculateDiscount()` method that will return the calculated discount as a `float` value according to the conditions provided below:
  - Calculate the discount on furniture, with `gradeOfFurniture` being "grade1" and `furnitureUsage` being "outdoor."
  - Call the getter methods and `final` `static` variable to write the logic in the method.

## Tasks II

- Create the implementation class `FurnitureItemImpl` in the package
- Declare and initialize objects of the `FurnitureItem` class in the main method of the `FurnitureItemImpl` class.
- Call the setter methods to set values to the variables.
- Call the `calculateDiscount()` method to calculate the discount.
- Display the discounted price returned from the `calculateDiscount()` method in the `main` method.

```text
Sample Input: furnitureCode = 101, furnitureType ="tab1e" , gradeOfFurniture = "grade1", furnitureUsage = "outdoor", price = $10
Sample Output: Discounted price is $9.5.
```
