const customerUrl = "http://localhost:3001/customers";
const passwordElement = document.getElementById("custPassword");
const confirmPasswordElement = document.getElementById("custConfirmPassword");

//Write  password validation code here 
function setPasswordConfirmValidity() {
  if (passwordElement.value != confirmPasswordElement.value) {
    confirmPasswordElement.style.backgroundColor = "fddddd";
    alert("!! ALERT !!\nPasswords entered do not match! Please enter same passwords.");
    return false
  }
  else {
    confirmPasswordElement.style.backgroundColor = "#77b259";
    return true;
  }
}
//Using axios POST to save the customer details 
// Note:As per test requirement, Customer API should be running on port 3001
function submitCustomerDetail(event) {
  event.preventDefault();
  if (!setPasswordConfirmValidity()) {
    return false;
  }

  let formData = new FormData(event.target);
  let cxData = Object.fromEntries(formData);

  postCustomerDataToServer(cxData);
  event.target.reset();
}
/*
  Post successful submission to server, 
  the function should display the text `You have successfully registered !` on the page
  */
function postCustomerDataToServer(cxData) {
  let postPromise = axios.post(customerUrl, cxData);
  postPromise
    .then(response => {
      console.log(`Customer: [${cxData.custId}:${cxData.name}] Response: [Status:${response.status} Message:${response.statusText}]`);
      alert("!! SUCCESS !!\nYou have successfully registered !");
    })
    .catch(error => {
      let msg = `POST failed for [URL:${todoURL}]!`
      alert(msg);
      console.log(msg);
      console.error(error);
    });
}
// do not delete the code given below, it is written to export the functions to be tested
module.exports = {
  setPasswordConfirmValidity,
  submitCustomerDetail
}



