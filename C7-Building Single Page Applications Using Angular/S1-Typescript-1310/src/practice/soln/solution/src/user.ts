//Define User class
class User {
    // Field declarations
    private _username: string;
    private _password: string;
    private _contact: number;
    private _email: string;
    private _address: string;

    // constructor 
    constructor(username: string, password: string, contact: number, email: string, address: string) {
        this._username = username;
        this._password = password;
        this._contact = contact;
        this._email = email;
        this._address = address;
    }

    // getter and setter methods
    set username(value: string) {
        this._username = value;
    }
    get username() {
        return this._username;
    }

    set password(value: string) {
        this._password = value;
    }
    get password() {
        return this._password;
    }

    set contact(value: number) {
        this._contact = value;
    }
    get contact() {
        return this._contact;
    }

    set email(value: string) {
        this._email = value;
    }
    get email() {
        return this._email;
    }

    set address(value: string) {
        this._address = value;
    }
    get address() {
        return this._address;
    }
}

const submitUser = (formData: any) => {
    //Fetch form values using Object.fromentries()
    let form = Object.fromEntries(new FormData(formData));

    //call registerUser method with the constructed User object
    let user = new User(<string>form.username, <string>form.password, parseInt(<string>form.contact), <string>form.email, <string>form.address);
    let url: string = "http://localhost:3000/users";
    registerUser(url,user);
    //Do not modify or delete;return false will stop the page reload to happen after form submission
    return false;
}

//POST data using fetch() api
function registerUser(url: string, user: User) {
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
}