/*
*   ACTIVITY - 2
*   PROBLEM - 1
*   DURATION - 20 minutes

*   The JavaScript test code for testing solution code of calculating average of wickets taken is given below:
   
*   DO NOT MODIFY THIS TEST CODE
*/

const expect = require('chai').expect;
const calculateAverage = require('../solution/p1-calculate-wicket-average.js');

describe('Calculate Wicket Average Solution', function () {
    it('should have function calculateAverage()', function () {
        expect(typeof calculateAverage).to.be.equal('function');
    });
});

describe('calculateAverage', function() {
    it('should return `Incorrect Count Value` if the value of first_innings_count is less than zero', function() {
        const result = calculateAverage(-1, 0);
        expect(result).to.be.equal("Incorrect Count Value");
    });
    it('should return `Incorrect Count Value` if the value of second_innings_count is less than zero', function() {
        const result = calculateAverage(1, -2);
        expect(result).to.be.equal("Incorrect Count Value");
    });
    it('should return `Invalid Count Value` if the value of first_innings_count is not a number', function() {
        const result = calculateAverage("0", 4);
        expect(result).to.be.equal("Invalid Count Value");
    });
    it('should return `Invalid Count Value` if the value of second_innings_count is not a number', function() {
        const result = calculateAverage(1, "0");
        expect(result).to.be.equal("Invalid Count Value");
    });
    it("should return average of counts for valid values of first_innings_count and second_innings_count", function() {
        const result = calculateAverage(3, 2);
        expect(result).to.be.equal(2.5);
    });
});
