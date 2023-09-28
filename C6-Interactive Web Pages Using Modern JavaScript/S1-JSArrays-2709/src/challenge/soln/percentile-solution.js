const marks = [45, 68, 31, 95, 82, 66, 71];

//function to sort the array of marks passed as parameter
function sortArray(marksArray) {
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

//function to compute and return the percentile array as asked in ReadMe
function calculatePercentileArray(marksArray) {
  sortArray(marksArray);
  let length = marksArray.length;

  if (length === "undefined") {
    return "Incorrect input to function! Number array expected.";
  }

  let percentileArray = [];
  for (let i = 0; i < length; i++) {
    let element = marksArray[i];
    let count = 0;
    for (let j = 0; j < length; j++) {
      if (marksArray[j] < element) {
        count++;
      }
    }

    let percentile = Math.round((count * 100) / length);
    percentileArray[i] = percentile;
  }

  return percentileArray;
}

// Simpler logic to create percentile array being validated in spec instead of counting if sorting the array
function calculatePercentileArraySimplerLogic(marksArray) {
  let length = marksArray.length;
  if (length === "undefined") {
    return "Incorrect input to function! Number array expected.";
  }

  let percentileArray = [];
  for (let i = 0; i < length; i++) {
    let percentile = Math.round((i * 100) / length);
    percentileArray.push(percentile);
  }

  return percentileArray;
}

// Returns percentile array in order of the input marks instead of a sorted array.
function calculatePercentileArrayCorrect(marksArray) {
  let sortedArray = [...marksArray];
  sortArray(sortedArray);
  let length = sortedArray.length;

  if (length === "undefined") {
    return "Incorrect input to function! Number array expected.";
  }

  let percentileArray = [];
  for (let i in marksArray) {
    for (let j in sortedArray) {
      if (sortedArray[j] == marks[i]) {
        let percentile = Math.round((j * 100) / length);
        percentileArray[i] = percentile;
      }
    }
  }

  return percentileArray;
}

// do not delete below code, it is written to make the functions exportable for testing purpose
module.exports = {
  sortArray,
  calculatePercentileArray,
};

// console.log(calculatePercentileArray(marks));
// console.log(calculatePercentileArrayCorrect(marks));
