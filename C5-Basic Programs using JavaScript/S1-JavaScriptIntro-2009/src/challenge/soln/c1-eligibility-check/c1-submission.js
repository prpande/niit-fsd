/*
    Challenge 1 - Check Eligibility
*/

// Declare variables to store age, gender, isUSCitizen (true/false) and statePageant values
const details = {
  Age: 23,
  Gender: "Male",
  IsUSCitizen: true,
  StatePageant: "Virginia",
};

// Write logic using if..else statements to check and display the eligibility status
let isEligible = true;

if (details.Age < 18 || details.Age > 28) {
  isEligible = false;
} else if (details.Gender !== "Female") {
  isEligible = false;
} else if (!details.IsUSCitizen) {
  isEligible = false;
} else if (details.StatePageant === null) {
  isEligible = false;
}

let message = "Eligible";
if (!isEligible) {
  message = "Not Eligible";
}

console.log(message);
