# Algorithm and Pseudocode Class Notes 17/07

## Algorithm

Step by step instructions to solve a given problem

- clear with prob stat -- clarity in our thoughts
- step wise precise instructions
- medium -- **english** like language

### Example: area of rectangle

- **step1** Start
- **step2** accept length and breadth
- **step3** calculate the area by multiplying length and breadth
- **step4** return the area
- **step5** end

## Pseudocode

- Similar to algorithms but has language/medium close to a programming language.
- Contains **keywords** similar to a programming language

### Example: area of rectangle

    BEGIN
        GET length, breadth
        SET area = length * breadth
        PRINT area
    END

Perform a dry run of your algorithm/pseudocode to validate it.

## Program

Set of instructions to perform a particular task

### Programming Constructs

1. sequential - statements execute one after the other
2. conditional or selective - statements execute on the basis of conditions (if-else & switch-case)
3. iteration or loops - repetition of a set of statements

### Example: Calculate Sum of numbers till max limit

    BEGIN
        GET max_limit
        SET sum = 0
        FOR ctr = 1 to num max_limit
        DO
            sum = sum + ctr
        ENDFOR
        PRINT sum
    END

### Example: Print all multiples of 8 between 1 to n

    BEGIN
        GET n
        FOR i = 1 to n 
        DO
            SET remainder = i % 8
            IF i == 0
            BEGIN
                PRINT i
            ENDIF
        ENDIF
    END
