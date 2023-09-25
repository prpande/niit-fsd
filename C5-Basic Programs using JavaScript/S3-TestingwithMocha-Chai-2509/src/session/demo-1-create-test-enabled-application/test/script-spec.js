const expect = require('chai').expect;
const display = require('../solution/script');

describe('Script', function () {
    it('should have function display()', function () {
        expect(typeof display, "function with the name display is not defined")
        .to.be.equal("function");
    });
});