//Declare and initialize an object called student with the following properties:
// firstName, lastName, age, email, phoneNum, and address.​
const student = {
  firstName: "John",
  lastName: "Britto",
  age: 15,
  email: "john@gmail.com",
  phoneNum: 258963654,
  address: "Park Avenue street, New York",
};

//Display the object properties using console.log statements
function displayObjectProperties(obj) {
    for(var prop in obj)
    {
        let value = obj[prop];
        console.log(`${prop}: ${value}`);
    }
}

displayObjectProperties(student);