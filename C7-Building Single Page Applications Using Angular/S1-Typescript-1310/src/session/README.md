# Sprint 1: Build Interactive Web pages Using TypeScript

### This Sprint has 6 demos

[**Demo 1: TypeScript Datatypes**](./demo-1-datatypes/)

- Declare a variable to store a person name with "string" datatype. Display a welcome message to greet the person with his name.
- Create a TypeScript program that stores employee details in different variables without associating with datatypes initially. Then add appropriate data types to each variable.  Observe that TypeScript compiler notifies the error if the wrong types are used in the wrong places. 
   - Declare variables firstName, lastName, salary, designation, hasMedicalInsurance without data types. 
   - Initialize them with sample values 'John', 'Christ', ‘450’, 'Software Developer' and false respectively. 
   - Add another variable called incrementedSalary like below: 
             let incrementedSalary = salary+30; 
   - Observe the unexpected output for salary as 45030 (instead of 480). It has concatenated the two numbers considering them as strings. 
   - Now assign appropriate data type to each variable to resolve the unexpected output. 
   - While adding ‘450’ as value to salary variable, TypeScript throws compilation error which helps the developer to fix the problem earlier. 

[**Demo 2 - Functions With Type Annotations**](./demo-2-function-with-types/)

- Declare a function to calculate the square of a number which accepts only numeric data type. Call the function with the numeric data type and call once again with the string data type to find out the difference. Determine which one runs successfully, and which one throws an error. 
    - Declare a function `add` with 2 parameters- `num1` of type number, `num2` of type number and the return type as number. 
    - The function returns the sum of the 2 parameter values.
    - Declare 2 variables a and b of number type and initialize it with 10 and 20 respectively. 
    - Call function add() with numeric variables a and b. It will successfully execute and will return result. 
    - Declare another variable c of string type and initialize it with ‘John’. 
    - Call function add() again with variables a and c. It will result in a compilation error as second argument type is not matching. 

 [**Demo 3 - Anonymous Functions**](./demo-3-anonymous-functions/)   

 - Create a TypeScript program to convert each string value in an array to its uppercase using TypeScript anonymous and arrow functions. 
    - Declare an array called names with sample values "Alice", "Bob" and "Eve". 
    - Use an anonymous function as callback function inside the forEach method and do not provide any data type for the parameter “s” for it.
    - Since forEach function is called for the "names" array that is of "string" type, TypeScript used this data type(string) for the callback function's parameter. 
    - Hence, the data type for parameter "s" will be of "string" type. This is called as contextual typing in which the context that the function occurred within informs what type it should have. 
    - Similarly, execute contextual typing for arrow functions also. 

[**Demo 4 - Object Types in TypeScript**](./demo-4-object-type/)

- Create a TypeScript program to print the details of a university student by creating a student object type. The details to store and print are student ID​, first name, last name, fees, course​ and Whether the student has opted for hostel facility or not.
    - Declare a type MyStudent with properties studentId, firstName, lastName, course, fees, availHostel. 
    - Make lastName as optional parameter by using ‘?’. 
    - Declare a function printStudent() which will accept a parameter of MyStudent type      
    - Inside the function, display the student details after checking the availability of optional property lastName. 
    - Declare hostelStudent and student1 of type MyStudent and assign values to object properties. ​
    - Call the printStudent() function by passing these object types to display student details in the console. 
    
 [**Demo 5 - Create a Student Class**](./demo-5-class/)

 - Create a student class which has various properties like studentID, name and marks. Define the constructor to initialize objects and getMarks() method to return the student's mark. Create multiple instances of the student class and access its properties.
    - Declare a class Student with properties `studentID: number`, `name: string`, and `marks: number`. 
    - Declare a parameterized constructor with parameters studentID, name and marks. 
    - Use `this` keyword to assign parameter data to instance variables. 
    - Declare a method getMarks() which will return the marks of student. 
    - Create multiple instances of Student class using `new` keyword  by passing different  arguments to each of the instance. 
    - Display the student details by accessing their properties with the object names. 

[**Demo 6 - Build a Contact Form Page Using TypeScript**](./demo-6-contact-form-page/)

- Create a contact form page by modeling the contact class with username, email, and message properties. The properties are declared as private to restrict their accessibility. ​The contact details are stored in a database using fetch API. A confirmation message is displayed to the user after successful submission.
    - Design user contact form with fields username, email and message with required validations. 
    - On form submit, call function submitContact() which is defined in public/js/contact.js. 
    - Create a contact.ts file in `src` folder. Declare a class Contact with properties username, email, and message. Make these properties as private so that directly they are not accessible outside class. 
    - Declare parameterized constructor for the class and initialize instance variables using `this` keyword. 
    - Define getters and setters for email and message. Define only getters for username which means that username cannot be modified once constructed. 
    - Capture the form field values using FormData. 
    - Next, use Object.fromEntries() method to transform the list of key-value pairs into an object.  
    - Using these object properties, the Contact class object is constructed, and the new contact object is added to the database using fetch API. 
    - A confirmation message is displayed to the user with his name and mail ID. 
    - The Contact class properties are not directly accessed outside the class. Instead, they are accessed only through their respective getter methods. 
    - Accessing the private properties outside the class throws compilation errors.