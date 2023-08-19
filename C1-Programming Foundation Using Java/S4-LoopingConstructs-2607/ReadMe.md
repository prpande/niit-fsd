# Looping Constructs 26/07

- Implemented to achieve repetition in code
- When some statements need to iterated through multiple times
- Set of instructions reduced to a single instruction
- Pre-tested - `for` and `while` loops. Checks the condition first. Entry controlled loop.
- Post-tested - `do-while` loops. Checks the condition after block execution. Exit controlled loop. Runs at least once.

## `for` loop format

```java
    for(/*initialization*/; /*condition*/; /*update*/)
    {
        ...
    }
```

## `while` loop format

```java
    /*initialization out side the loop*/
    while(/*condition*/)
    {
        /*update inside the loop if necessary as per logic*/
        ...
    }
```

## `do-while` loop format

```java
    /*initialization outside the loop*/
    do
    {   
        /*update inside the loop if necessary as per logic*/
        ...
    }while(/*condition*/);
```

## Nested Loops

Loop inside another loop

```java
    for(/* Outer-for condition and initialization*/)
    {
        ...
        for(/* Inner-for condition and initialization*/)
        {
            ...
        }
    }
```
