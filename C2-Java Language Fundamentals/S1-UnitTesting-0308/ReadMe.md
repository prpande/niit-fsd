# Unit Testing with JUnit - 0308

## SDLC : Software Development Life cycle

**Phases:**

1. Feasibility study
2. Requirement analysis
3. Design
4. Coding
5. Testing
6. Deployment
7. Maintenance / Update

## Functional testing

- Unit testing - testing and validating individual units/functionality that make up the software
- Integration Testing - system/end to end tests.

## JUnit : Java unit testing framework

- Open-source - no special license needed
- Used to create test cases
- Emphasizes the implementation of Test Driven Development (TDD)
- Code class -> App.java Test Class -> AppTest.java
- every test case should have the annotation `@Test`

### Test Case Structure

```java
    @Test
    public void testCaseName()
    {
        // Triple A's
        //arrange - arranging input and expected output(setup the test dat
        //act - call the code to be tested
        //assertion - verify that the actual result is same as expected.
    }
```

> No `main()` in test class.

> Delta or epsilon value required when asserting for equality/comparison.\
> Epsilon is the value that the 2 numbers can be off by. So it will assert to true as long as `Math.abs(expected - actual) <= epsilon`

 ```java
    assertEqua1s(expectedResu1t, actualResult, 0.001); //delta or epsilon value
```
