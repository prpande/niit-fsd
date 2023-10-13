"use strict";
const contacts = [];
class Contact {
    constructor(username, email, message) {
        this._username = username;
        this._email = email;
        this._message = message;
    }
    set email(value) {
        this._email = value;
    }
    set message(value) {
        this._message = value;
    }
    get username() {
        return this._username;
    }
    get message() {
        return this._message;
    }
    get email() {
        return this._email;
    }
}
const submitContact = (formData) => {
    let form = Object.fromEntries(new FormData(formData));
    const contact = new Contact(form.username, form.email, form.message);
    sendContactMessage(contact);
};
function sendContactMessage(contact) {
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(contact)
    };
    fetch('http://localhost:3000/contacts/', requestOptions)
        .then(response => response.json())
        .then(data => console.log(data));
    // contacts.push(contact);
    // console.log(JSON.stringify(contacts));
    // console.log("users", ...contacts);
    window.alert(`Thanks ${contact.username},\nYou will reecvieve notifications to this ${contact.email}`);
}
