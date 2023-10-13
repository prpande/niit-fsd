//Define User class
class User {
    //Field declartions

    //constuctor 

    //getter and setter methods


}

const submitUser = (formData: any) => {
    //Fetch form values using Object.fromentries()

    //call registerUser method with the constructed User object

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

}

// do not delete the code given below, it is written to export the functions to be tested
module.exports = {
    registerUser
}