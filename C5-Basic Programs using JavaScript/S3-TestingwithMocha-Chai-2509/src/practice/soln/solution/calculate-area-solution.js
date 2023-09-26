// copy the solution code from `Practice 1 - Calculate Area`
// from the sprint `Implement Modular Programming using Functions`
const PI = 3.14;

function calculateAreaOfSquare(side) {
  if (side == undefined) {
    return "Insufficient Inputs!";
  }
  if (typeof side != "number") {
    return "Invalid input type, `side` should be a Number!";
  }
  if (side < 0) {
    return "Incorrect input, `side` cannot be Negative!";
  }

  return side * side;
}

function calculateAreaOfCircle(radius) {
  if (radius == undefined) {
    return "Insufficient Inputs!";
  }
  if (typeof radius != "number") {
    return "Invalid input type, `radius` should be a Number!";
  }
  if (radius < 0) {
    return "Incorrect input, `radius` cannot be Negative!";
  }

  return PI * radius * radius;
}

function calculateAreaOfRectangle(length, breadth) {
  if (length == undefined || breadth == undefined) {
    return "Insufficient Inputs!";
  }
  if (typeof length != "number" || typeof breadth != "number") {
    return "Invalid input types, `length` and `breadth` should be Numbers!";
  }
  if (length < 0 || breadth < 0) {
    return "Incorrect inputs, `length` and `breadth` cannot be Negative!";
  }

  return length * breadth;
}

// do not delete the below code, it is written to export the functions to be tested
module.exports = {
  calculateAreaOfCircle,
  calculateAreaOfRectangle,
  calculateAreaOfSquare,
};
