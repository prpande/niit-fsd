// Write test code here
const chai = require('chai');
const expect = chai.expect;

const solution = require('../solution/calculate-area-solution');

describe('solution', function(){
    it("should have function `calculateAreaOfSquare()`", function(){
        expect(typeof solution.calculateAreaOfSquare).to.be.equal('function');
    });

    it("should have function `calculateAreaOfCircle()`", function(){
        expect(typeof solution.calculateAreaOfCircle).to.be.equal('function');
    });

    it("should have function `calculateAreaOfRectangle()`", function(){
        expect(typeof solution.calculateAreaOfRectangle).to.be.equal('function');
    });
});

describe('Function calculateAreaOfSquare', function(){
    it('should return area of square for the valid input provided', function(){
        const area = solution.calculateAreaOfSquare(7);
        expect(area).to.be.equal(49);
    });

    it('should return message insufficient input if less than 1 parameter is passed', function(){
        const result = solution.calculateAreaOfSquare();
        expect(result).to.be.equal("Insufficient Inputs!");
    });

    it('should return message invalid input type if the parameter is not a number', function(){
        const result = solution.calculateAreaOfSquare("7");
        expect(result).to.be.equal("Invalid input type, `side` should be a Number!");
    });

    it('should return message incorrect input if the value of the parameter is less than or equal to 0', function(){
        const result = solution.calculateAreaOfSquare(-7);
        expect(result).to.be.equal("Incorrect input, `side` cannot be Negative!");
    });
});

describe('Function calculateAreaOfCircle', function(){
    it('should return area of circle for the valid input provided', function(){
        const area = solution.calculateAreaOfCircle(3.4);
        expect(area).to.be.equal(36.2984);
    });

    it('should return message insufficient input if less than 1 parameter is passed', function(){
        const result = solution.calculateAreaOfCircle();
        expect(result).to.be.equal("Insufficient Inputs!");
    });

    it('should return message invalid input type if the parameter is not a number', function(){
        const result = solution.calculateAreaOfCircle("3.4");
        expect(result).to.be.equal("Invalid input type, `radius` should be a Number!");
    });

    it('should return message incorrect input if the value of the parameter is less than or equal to 0', function(){
        const result = solution.calculateAreaOfCircle(-3.4);
        expect(result).to.be.equal("Incorrect input, `radius` cannot be Negative!");
    });
});

describe('Function calculateAreaOfRectangle', function(){
    it('should return area of rectangle for the valid input provided', function(){
        const area = solution.calculateAreaOfRectangle(7.2, 5.5);
        expect(area).to.be.equal(39.6);
    });

    it('should return message insufficient input if less than 2 parameter are passed', function(){
        const result = solution.calculateAreaOfRectangle();
        expect(result).to.be.equal("Insufficient Inputs!");
    });

    it('should return message invalid input type if the parameters are not of type numbers', function(){
        const result = solution.calculateAreaOfRectangle("7.2", "5.5");
        expect(result).to.be.equal("Invalid input types, `length` and `breadth` should be Numbers!");
    });

    it('should return message incorrect input if the value of each of the parameters is less than or equal to 0', function(){
        const result = solution.calculateAreaOfRectangle(-7.2, -5.5);
        expect(result).to.be.equal("Incorrect inputs, `length` and `breadth` cannot be Negative!");
    });
});
