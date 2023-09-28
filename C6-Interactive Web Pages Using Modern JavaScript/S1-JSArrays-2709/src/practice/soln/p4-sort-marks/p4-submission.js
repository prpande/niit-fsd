const marks = [83, 40, 33, 24, 7, 90, 73, 56, 18, 60];
//Sort the marks from an array of marks passed as parameter
function sortMarks(marksArray) {
  let incorrectInputMsg = "Incorrect input to function! Number array expected.";

  let length = marksArray.length;
  if (length === "undefined") {
    return incorrectInputMsg;
  }

  for (let i = 0; i < length - 1; i++) {
    for (let j = 0; j < length - 1 - i; j++) {
      if (typeof marksArray[j] !== "number") {
        return incorrectInputMsg;
      }
      if (marksArray[j] > marksArray[j + 1]) {
        let temp = marksArray[j];
        marksArray[j] = marksArray[j + 1];
        marksArray[j + 1] = temp;
      }
    }
  }

  return marksArray;
}

// do not delete below code, it is written to make the functions exportable for testing purpose
module.exports = {
  sortMarks,
};

console.log(`Sorted array: ${sortMarks(marks)}`);
