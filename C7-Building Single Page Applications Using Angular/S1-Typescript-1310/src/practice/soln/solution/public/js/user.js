"use strict";
//Define User class
class User {
    // constructor 
    constructor(username, password, contact, email, address) {
        this._username = username;
        this._password = password;
        this._contact = contact;
        this._email = email;
        this._address = address;
    }
    // getter and setter methods
    set username(value) {
        this._username = value;
    }
    get username() {
        return this._username;
    }
    set password(value) {
        this._password = value;
    }
    get password() {
        return this._password;
    }
    set contact(value) {
        this._contact = value;
    }
    get contact() {
        return this._contact;
    }
    set email(value) {
        this._email = value;
    }
    get email() {
        return this._email;
    }
    set address(value) {
        this._address = value;
    }
    get address() {
        return this._address;
    }
}
const submitUser = (formData) => {
    //Fetch form values using Object.fromentries()
    let form = Object.fromEntries(new FormData(formData));
    //call registerUser method with the constructed User object
    let user = new User(form.username, form.password, parseInt(form.contact), form.email, form.address);
    let url = "http://localhost:3000/users";
    registerUser(url, user);
    //Do not modify or delete;return false will stop the page reload to happen after form submission
    return false;
};
//POST data using fetch() api
function registerUser(url, user) {
    // return the promise returned by the fetch() method
    /*
    Post successful submission to server,
    the function should display the text `You have successfully registered!` on the page
    */
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(user)
    };
    return fetch(url, requestOptions)
        .then(response => response.json())
        .then(data => {
        document.getElementsByTagName("form")[0].innerHTML += "You have successfully registered!";
    });
}
// do not delete the code given below, it is written to export the functions to be tested
module.exports = {
    registerUser
};
