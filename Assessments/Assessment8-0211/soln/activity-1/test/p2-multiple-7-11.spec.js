// import the functions to be tested
const multipleOf7Or11 = require("../solution/p2-multiple-7-11.js");
// import the testing library
const expect = require("chai").expect;
 
describe("multipleOf7Or11", () => {
    it("should be defined as a function", function() {
        expect(typeof multipleOf7Or11).to.be.equal("function");
    });
    it("should return -1 if the type of parameter is not a number", () => {
        expect(multipleOf7Or11("5")).to.equal(-1);
    });
    it("should return 3 if the number is multiple of 7 and 11 both", () => {
        expect(multipleOf7Or11(77)).to.equal(3);
    });
    it("should return 1 if the number is multiple of only 7", () => {
        expect(multipleOf7Or11(14)).to.equal(1);
    });
    it("should return 2 if the number is multiple of only 11", () => {
        expect(multipleOf7Or11(22)).to.equal(2);
    });
    it("should return 0 if the number is not a multiple of 7 or 11", () => {
        expect(multipleOf7Or11(5)).to.equal(0);
    });
});