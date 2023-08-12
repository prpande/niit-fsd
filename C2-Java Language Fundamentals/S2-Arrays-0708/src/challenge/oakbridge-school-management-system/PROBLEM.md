# Problem Statement : Oak Bridge School Management System

Educational institutions have to manage a lot of paperwork and manual processes. At times, it is difficult for them to maintain records of students’ results, attendance reports, etc. The management and teachers at the Oak Bridge School have conducted exams for their high school students and completed the evaluation of the answer scripts. ​
With the help of a technical team, the teachers need to put a system in place to automate the grading process. They have to make teams and assigned tasks to each team.

The average and the total marks for the students of grade 9 have to be calculated.

The students are evaluated on only 3 core subjects:

- Math
- Science
- English

The test will be taken for 100 marks, and the students need to score a minimum of 35 marks to pass the test.

## Tasks - Set 1

### Task 1

1. Write all the logic for the program inside the `OakBridgeSchool` class provided.
2. Write the logic to calculate the total marks of the students inside the below method.

   ```java
   public int[] calculateTotalMarks(int [] math,int science[],int[] english)
   ```

- The `calculateTotalMarks` method takes the arrays of individual subject mark of the students and returns an integer array that consists of the total marks of each student in the class.

### Task 2

1. Write the logic to calculate the average marks of the students inside the below method.

   ```java
    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects)
   ```

- The `calculateTotalAverageMarksForEachStudent` method takes the total marks of each student and the number of subjects on which they will be evaluated and returns the average mark of each student in an integer array.

## Tasks - Set 2

### Task 1

Write the logic to calculate the average science mark inside the below method.

```java
public int calculateAverageScienceMarks (int[] science)
```

### Task 2

Write the logic to calculate the average English mark inside the below method.

```java
public int calculateAverageEnglishMarks (int[] english)
```

### Task 3

Write the logic to calculate the average math mark inside the below method.

```java
public int calculateAverageMathMarks (int[] math)
```

## Tasks - Set 3

In the `main` method,

- Declare and initialize values to the math, science, English integer arrays
- Declare and initialize values to a string array that holds the student names
- Declare and initialize values to an integer array that holds the roll numbers 
- Create an object of the class OakBridgeSchool