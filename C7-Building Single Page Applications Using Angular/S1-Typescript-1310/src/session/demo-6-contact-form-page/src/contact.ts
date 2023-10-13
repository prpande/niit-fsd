
const contacts: any = [];
class Contact {
    private _username: string;
    private _email: string;
    private _message: string;

    constructor(username: string, email: string, message: string) {
        this._username = username;
        this._email = email;
        this._message = message;
    }
    set email(value:string) {
        this._email = value;
    }
    set message(value: string) {
        this._message = value;
    }
    get username() {
        return this._username;
    }
    get message() {
        return this._message;
    }
    get email(){
        return this._email;
    }
   
}
const submitContact = (formData: any) => {
    let form = Object.fromEntries(new FormData(formData));
    const contact:Contact = new Contact(<string>form.username, <string>form.email, <string>form.message);
    sendContactMessage(contact);   
}

function sendContactMessage(contact:Contact){
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(contact)
    };
    fetch('http://localhost:3000/contacts/', requestOptions)
        .then(response => response.json())
        .then(data => console.log(data) );
    window.alert(`Thanks ${contact.username},\nYou will reecvieve notifications to this ${contact.email}`);
}

