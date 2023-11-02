/*
*   ACTIVITY - 2
*   PROBLEM - 2
*   DURATION - 40 minutes

*   Write test code for the solution code given in the `activity-2/solution/calculate-runs-average-spec.js` file.
*/
const expect = require('chai').expect;
const analyze_average_runs_scored = require('../solution/p2-analyze-runs-average');

describe('Analyze average runs scored Solution', function () {
    it('should have function analyze_average_runs_scored()', function () {
        expect(typeof analyze_average_runs_scored).to.be.equal('function');
    });
});

describe('analyze_average_runs_scored', function() {
    it('should return `Invalid Score` if the value of first_innings_runs_score is not a number', function() {
        const result = analyze_average_runs_scored("0", 41);
        expect(result).to.be.equal("Invalid Score");
    });
    it('should return `Invalid Score` if the value of second_innings_runs_score is not a number', function() {
        const result = analyze_average_runs_scored(34, "0");
        expect(result).to.be.equal("Invalid Score");
    });

    it('should return `Incorrect Score` if the value of second_innings_runs_score is less than zero', function() {
        const result = analyze_average_runs_scored(10, -10);
        expect(result).to.be.equal("Incorrect Score");
    });
    it('should return `Incorrect Score` if the value of first_innings_runs_score is less than zero', function() {
        const result = analyze_average_runs_scored(-40, 20);
        expect(result).to.be.equal("Incorrect Score");
    });

    it("should return Poor rating for average runs scored are less than or equal to 10", function() {
        const result = analyze_average_runs_scored(6, 12);
        expect(result).to.be.equal("Poor");
    });
    it("should return Average rating for average runs scored are between 11-50", function() {
        const result = analyze_average_runs_scored(20, 43);
        expect(result).to.be.equal("Average");
    });
    it("should return Good rating for average runs scored are between 51-100", function() {
        const result = analyze_average_runs_scored(35, 141);
        expect(result).to.be.equal("Good");
    });
    it("should return Outstanding rating for average runs scored are 101 and above", function() {
        const result = analyze_average_runs_scored(220, 70);
        expect(result).to.be.equal("Outstanding");
    });
});
