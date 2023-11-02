// import the functions to be tested
const factorial = require("../solution/p1-factorial.js");
// import the testing library
const expect = require("chai").expect;

describe("factorial", function() {
    it("should be defined as a function", function() {
        expect(typeof factorial).to.be.equal("function");
    });
    // write test case to check for undefined
    it("should return `Cannot calculate factorial of undefined` when argument is missing", function() {
        expect(factorial(undefined)).to.be.equal(`Cannot calculate factorial of undefined`);
    });
    // write test case to check for negative number
    it("should return `Cannot calculate factorial of a negative number` when argument is negative", function() {
        expect(factorial(-1)).to.be.equal(`Cannot calculate factorial of a negative number`);
    });
    // write test case to check for string
    it("should return `Cannot calculate factorial of a non-number` when argument is string", function() {
        expect(factorial("abc")).to.be.equal(`Cannot calculate factorial of a non-number`);
    });
    it("should return 120 when input is 5", function() {
        expect(factorial(5)).to.be.equal(120);
    });
    it("should return 1 when input is 0", function() {
        expect(factorial(0)).to.be.equal(1);
    });
    it("should return 1 when input is 1", function() {
        expect(factorial(1)).to.be.equal(1);
    });
    it("should return 2 when input is 2", function() {
        expect(factorial(2)).to.be.equal(2);
    });
    it("should return 6 when input is 3", function() {
        expect(factorial(3)).to.be.equal(6);
    });
});