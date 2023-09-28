const marks = [83, 40, 33, 24, 7, 90, 73, 56, 18, 60];

//Calculate the average of array of marks passed as parameter
function calculateAverage(marksArray) {
  let incorrectInputMsg = "Incorrect input to function! Number array expected.";
  let sum = 0;

  let length = marksArray.length;
  if (length === "undefined") {
    return incorrectInputMsg;
  }

  for (let element of marksArray) {
    if (typeof element !== "number") {
      return incorrectInputMsg;
    }

    sum += element;
  }

  return sum / length;
}

// do not delete below code, it is written to make the functions exportable for testing purpose
module.exports = {
  calculateAverage,
};

console.log(`Avg Marks: ${calculateAverage(marks)}`);