const expect = require('chai').expect;
const solution = require('../solution/script');

describe('Solution', function () {
    it('should have function calculateTotalMarks()', function () {
        expect(typeof solution.calculateTotalMarks).to.be.equal('function');
    });
    it('should have function calculateAverageOfMarks()', function () {
        expect(typeof solution.calculateAverageOfMarks).to.be.equal('function');
    });
    it('should have function calculateGrade()', function () {
        expect(typeof solution.calculateGrade).to.be.equal('function');
    });
});

describe('calculateTotalMarks', function() {
    it('should return total for marks provided', function() {
        const totalMarks = solution.calculateTotalMarks(60, 80, 70);
        expect(totalMarks).to.be.equal(210);
    });
    it('should return message insufficient inputs if less than 3 parameters are passed', function() {
        const result = solution.calculateTotalMarks(60, 65);
        expect(result).to.be.equal("Insufficient Inputs");
    });
    it('should return message invalid input type if any of the parameters is not a number', function() {
        const result = solution.calculateTotalMarks(60, 65, "O");
        expect(result).to.be.equal("Invalid Input Types, Mark Should Be A Number !!");
    });
    it('should return message incorrect input if value of any of the parameters is less than 0', function() {
        const result = solution.calculateTotalMarks(60, 65, -50);
        expect(result).to.be.equal("Incorrect Input, Mark Cannot Be Negative !!");
    });
});

describe('calculateAverageOfMarks', function() {
    it('should return average for marks provided', function() {
        const averageMarks = solution.calculateAverageOfMarks(60, 80, 70);
        expect(averageMarks).to.be.equal(70);
    });
    it('should return message insufficient inputs if less than 3 parameters are passed', function() {
        const result = solution.calculateAverageOfMarks(60, 65);
        expect(result).to.be.equal("Insufficient Inputs");
    });
    it('should return message invalid input type if any of the parameters is not a number', function() {
        const result = solution.calculateAverageOfMarks(60, "O", 65);
        expect(result).to.be.equal("Invalid Input Types, Mark Should Be A Number !!");
    });
    it('should return message incorrect input if value of any of the parameters is less than 0', function() {
        const result = solution.calculateAverageOfMarks(60, -65, -50);
        expect(result).to.be.equal("Incorrect Input, Mark Cannot Be Negative !!");
    });
});

describe('calculateGrade', function() {
    it('should return grade A for marks value 85, 80 and 83', function() {
        const grade = solution.calculateGrade(85, 80, 83);
        expect(grade).to.be.equal("Grade A");
    });
    it('should return grade B for marks value 60, 80 and 70', function() {
        const grade = solution.calculateGrade(60, 80, 70);
        expect(grade).to.be.equal("Grade B");
    });
    it('should return grade C for marks value 60, 80 and 70', function() {
        const grade = solution.calculateGrade(60, 55, 58);
        expect(grade).to.be.equal("Grade C");
    });
    it('should return message insufficient inputs if less than 3 parameters are passed', function() {
        const result = solution.calculateGrade(60, 65);
        expect(result).to.be.equal("Insufficient Inputs");
    });
    it('should return message invalid input type if any of the parameters is not a number', function() {
        const result = solution.calculateGrade(60, "O", 65);
        expect(result).to.be.equal("Invalid Input Types, Mark Should Be A Number !!");
    });
    it('should return message incorrect input if value of any of the parameters is less than 0', function() {
        const result = solution.calculateGrade(60, -65, -50);
        expect(result).to.be.equal("Incorrect Input, Mark Cannot Be Negative !!");
    });
});
