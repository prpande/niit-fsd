const marks = [83, 40, 33, 24, 7, 90, 73, 56, 18, 60];
const threshold = 40;
//Find the count of students who have scored marks>=40 from tha array of marks passed as parameter
function findCount(marksArray) {
  let count = 0;

  for (let element of marksArray) {
    if (typeof element !== "number") {
      return "Incorrect input to function! Number array expected.";
    }

    if (element >= threshold) {
      count++;
    }
  }

  return count;
}

// do not delete below code, it is written to make the functions exportable for testing purpose
module.exports = {
  findCount,
};

console.log(`Count >= ${threshold}: ${findCount(marks)}`);
