# Practice 1: Students' Grades

The total grades of all 12th-grade students, regardless of their chosen pathway, must be calculated. The subjects vary depending on their choice of pathway.\
For example,\
A student who has opted for the medical pathway will get grades for math, physics, chemistry, and biology.\
A student who has opted for the non-medical stream will get grades for math, physics, and chemistry.\
A student who has chosen the business pathway will get grades for business studies, finance, and accounting.

## Tasks

- Write a program with overloaded methods that will help calculate the grades of of 12th grade students in different pathways.
- Create a class named `StudentMarks` inside the package `com.marks`
- Define `calculateMarks()` methods which will calculate the total marks for medical pathway students and return the sum of the total marks.

    ```java
    public int calculateMarks (int math, int physics, int chemistry int biology) {
    return sum;
    }
    ```

- Define `calculateMarks()` methods which will calculate the total marks for non-medical pathway students and return the sum of the total marks.
- Define` calculateMarks()` methods which will calculate the total marks for business pathway students and return the sum of the total marks.
- Create the implementation class `StudentImpl` inside the package `com.marks`
- Declare and initialize Objects of the `StudentMarks` class inside the main method of the
`StudentImpl` class.
- Call all the overloaded `calculateMarks()` method and pass the respective parameters.
- Display the value returned from the `calculateMarks()` method inside the `main` method.
