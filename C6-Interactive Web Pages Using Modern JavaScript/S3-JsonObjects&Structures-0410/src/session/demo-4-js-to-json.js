const customer = {
    firstName: "Robert",
    lastName: "Johnson",
    email: "robert.j@gmail.com",
    age: NaN,
    phoneNumbers: ['+12055110415','+12514120145','+12565130876'],
    address: {
        streetNumber: "252a",
        streetName: "Hale Hall",
        city: "Huntsville",
        state: "Alabama",
        postalCode: "AL"
    }
};
console.log(customer); // prints details in object notation
console.log(typeof customer); // object 
const customerJSON = JSON.stringify(customer); 
console.log(customerJSON); // prints details in string format
console.log(typeof customerJSON); // string